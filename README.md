Abstract - why the name is "Architecture As Code". Nasdanika Architectural Framework (NASDAF)
Application of open source products, including Nasdanika products, to architecture developent.
Comparison with two alternatives - an informal, and a formal using UML/Sparx Enterprise Architect.

Inspired by [TOGAF](https://en.wikipedia.org/wiki/The_Open_Group_Architecture_Framework).

Components with descriptions


Easy transition from informal Arch practiced in some orgs. See below. "Democratic" - low barrier of entry for contributors.

[Software architecture](https://en.wikipedia.org/wiki/Software_architecture) is the fundamental structure of a software system and the discipline of creating such structures and systems. Each structure comprises software elements, relations among them, and properties of both elements and relations.

Architecture development:

* Capturing and sharing software architecture.
* Architecture evolution is the process of maintaining and adapting an existing software architecture to meet changes in requirements and environment. As software architecture provides a fundamental structure of a software system, its evolution and maintenance would necessarily impact its fundamental structure. As such, architecture evolution is concerned with adding new functionality as well as maintaining existing functionality and system behavior.


## Requirements 

Java11/Eclipse IDE with support of Ecore model development - J2ee or modeling. metamodel
For modeling - text editor, Maven to generate

[TOC levels=6]

## Demo

Link to the demo, demo docs - how it is done. Short summary here.
Composite.


TODO - definitions of architecture an architecture development. 
Similarities with code and relationships with code.

## Components of Architecture Practice

* **[Metamodel](https://en.wikipedia.org/wiki/Metamodeling)** - contains specifications of types of "things" a.k.a. "concepts", "entities", "model elements". For example "Server" is a type of thing. Server specification may define that a server has an IP address attribute, a one-to-many containment relationship with "Hard Drive", and many-to-one non-containment "supportTeam" relationship with a "Team". 
* **Model** - contains descriptions of things (entities, instances, model elements). The descriptions comply with the meta-model specifications. For example, a model may contain multiple server model elements with different IP addresses, possibly referencing the same support team model element.
* **Viewpoint** - a specification of how model elements shall be represented (shown). For [UML](https://en.wikipedia.org/wiki/Unified_Modeling_Language) diagrams it would be a diagram type, e.g. [Component diagram](https://en.wikipedia.org/wiki/Component_diagram). Viewpoint is a meta-view. 
* **View** - a representation of model elements, possibly compliant with a viewpoint specification. A view can be graphical (diagram, chart), textual - a list, or a table (matrix), or be built from UI components such as trees and forms.
* **Repository** - a storage of models.   

### NASDAF 

This section provides an overview of NASDAF architecture practice components. 

#### Metamodel

NASDAF uses [Eclipse Modeling Framework](https://www.eclipse.org/modeling/emf/) [Ecore](https://download.eclipse.org/modeling/emf/emf/javadoc/2.9.0/org/eclipse/emf/ecore/package-summary.html#details) to define the meta-model.
This section provides an overview of Ecore concepts.

* **EMF Project** - contains one or more Ecore models and generator models. Generator models are used to generate Java classes from models. 
* **Ecore model** - contains one or more EPackages.
* **EPackage** - a grouping construct, contains EClassifiers (EClass, EDataElement, EEnum) and sub-packages.
* **EClass** - defines a "type of thing", e.g. "Server". Contains structural features - attributes and references, and operations. E.g. "Server".
* **EStructuralFeature** - an attribute or a reference. Can be single value on multi-value.  
    * **EAttribute** - simple value, e.g. a string, number, date. E.g. server's IP address can be defined as a single value string or as a multi-value string for servers with multiple network interfaces. A single IP address can also be defined as a multi-value integer with lower bound 4 and upper bound 6.
    * **EReference** - reference to model elements. Single or multi-value. Can be containing. For example, a server contains hard drives - a multi-value containment reference. A server references its support team - a single non-containment reference. References are uni-directional. However, a references may specify another reference as its opposite. Two opposite references act as a bi-directional reference.
* **EOperation** - class behavior. E.g. server may define ``patch()`` and ``restart()`` operations.
* **EDataType** - data type definition.
* **EEnum** - enumeration.

Metamodel elements can be annotated with **EAnnotation**.
Annotations can be used to associate documentation and constraints/validations with data elements.
An example of a validation would be ensuring uniqueness of IP addresses across all servers.

An Ecore metamodel is used to generate Java classes representing metamodel EClasses. 
Compiled classes can be packaged as a [Maven](https://en.wikipedia.org/wiki/Apache_Maven) jar and deployed to a Maven repository, e.g. [Maven Central](https://mvnrepository.com/repos/central).
Model files can also be packaged and published as a Maven jar.
Example - [Nasdanika Ncore](https://mvnrepository.com/artifact/org.nasdanika.core/ncore).

Ecore metamodel and generator model can be also loaded using Java API.

[Nasdanika HTML Ecore](https://docs.nasdanika.org/modules/html/modules/ecore/index.html) can be used to 
generate metamodel documentation. 
Example - [Nasdanika HTML Application Model](https://docs.nasdanika.org/modules/html/modules/models/modules/app/modules/model/index.html).

The metamodel defines the architectural [ubiquitous language](https://martinfowler.com/bliki/UbiquitousLanguage.html) and
generated documentation is a dictionary of that language.

Metamodels can reference other metamodels.
For example, the Application metamodel references Ncore metamodel.
Application metamodel classes extend and use Ncore metamodel classes.

Metamodel files are XML files and can be diffed and merged which facilitates collaborative development.

Ecore code generator uses ``@generated`` Javadoc tags to mark generated code. 
It does not overwrite code which is not marked as generated or if the generated tag is "dirty" - has some text after it, e.g. ``@generated NOT``. 
This feature allows generated and hand-crafted code to co-exist. 
For example:

* The generator creates an default implementation of EOperation which throws UnsupportedOperationException. 
* Developer adds ``NOT`` after ``@generated`` and provides operation implementation.
* In subsequent generations the generator would skip generation of this EOperation.  

See [EMF Tutorial](https://eclipsesource.com/blogs/tutorials/emf-tutorial/).

Another technique is to add ``Gen`` suffix to the generated method and leverage generated code in hand-crafted code:

```java
/**
* <!-- begin-user-doc -->
* <!-- end-user-doc -->
* @generated
*/
public String getNameGen() {
	return name;
}

public String getName() {
	return format(getNameGen());
}
```

#### Model & Repository

At runtime ecore models are organized as follows:

* ${javadoc/org.eclipse.emf.ecore.resource.ResourceSet} contains a collection of related cross-referencing resources.
* ${javadoc/org.eclipse.emf.ecore.resource.Resource} contain model elements which are instances of meta-model classes. Resources can be loaded on-demand. For example, a resource can be loaded when a reference to an object within the resource is resolved. Resources are identified by ${javadoc/org.eclipse.emf.common.util.URI}'s.
* Model elements can contain other elements. Model elements can also be identified by URI's.

One powerful feature of Ecore is object proxies. A proxy object can be created with an URI of the target object. 
EReferences may be configured to to transparently resolve proxies.

Resources can be loaded from different sources using ${javadoc/org.eclipse.emf.ecore.resource.Resource.Factory resource factories}.
Resource factories can be associated with extensions or protocols. 

${javadoc/org.eclipse.emf.ecore.resource.URIHandler} can be used to load/save resources as streams. 

Ecore provides ${javadoc/org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl} for loading and saving resources in [XMI](https://en.wikipedia.org/wiki/XML_Metadata_Interchange) format.

Models can be stored in a variety of databases using [CDO](https://www.eclipse.org/cdo/) and [NeoEMF](https://neoemf.atlanmod.org/).

Nasdanika provides the following resource and resource factory classes:

* ${javadoc/org.nasdanika.graph.processor.emf.GraphProcessorResource} - base abstract class for loading resources from graph ${javadoc/org.nasdanika.graph.Element}s.
* ${javadoc/org.nasdanika.drawio.emf.DrawioResource} - base abstract class for loading resources from [Drawio](https://www.diagrams.net/) (diagrams.net) diagrams. 
* ${javadoc/org.nasdanika.html.model.app.drawio.ResourceFactory} - loads [application model](https://docs.nasdanika.org/modules/html/modules/models/modules/app/modules/model/index.html) from Drawio diagrams. See [App Drawio](https://docs.nasdanika.org/modules/html/modules/models/modules/app/modules/drawio/index.html) for more detais.
* ${javadoc/org.nasdanika.persistence.ObjectLoaderResourceFactory} and ${javadoc/org.nasdanika.persistence.ObjectLoaderResource} - load models from [YAML](https://en.wikipedia.org/wiki/YAML) & [JSON](https://en.wikipedia.org/wiki/JSON). Also supports loading YAML and JSON from [data](https://en.wikipedia.org/wiki/Data_URI_scheme) URI's.
* ${javadoc/org.nasdanika.emf.persistence.NcoreDrawioResourceFactory} - resource factory for loading models from Drawio diagrams using "semantic mapping" where diagram element properties are used to specify how to load a model element represented by the diagram element. One diagram element can have multiple semantic mappings using namespaces, i.e. one diagram can be used to load multiple models representing different aspects of what is depicted on the diagram. See [EMF](https://docs.nasdanika.org/modules/core/modules/emf/index.html) for more details.
* ${javadoc/org.nasdanika.emf.persistence.ExcelResourceFactory} and ${javadoc/org.nasdanika.emf.persistence.ExcelResource} can be used to load resources from MS Excel files.  

Custom URI handlers can be created to load models from sources such as:

* GitHub or GitLab using REST API, [gitlab4j-api](https://github.com/gitlab4j/gitlab4j-api) or [JGit](https://www.eclipse.org/jgit/). E.g. ``git:`` scheme can be used to load resources using JGit, and ``gitlab:`` to load using gitlab4j-api. This approach would allow to reference resources at a specific reference, e.g. a branch or tag, which is more flexible than [git submodules](https://git-scm.com/book/en/v2/Git-Tools-Submodules). For REST API cases it would also allow to load resources on-demand instead of full clone.
* Maven resources can be addressed using ``maven://<group id>/<artifact id>/<version>/<file>[/<path in jar>]`` and loaded using [Maven Artifact Resolver](https://maven.apache.org/resolver/index.html).

Custom factories may load resources from, say:

* Issue tracking systems.
* Organization directories.

In some cases adapter services can be created to load models from information systems and serve them over HTTP(S) as XMI, JSON, or YAML. 
In case of XMI an adapter may leverage classes generated from metamodels to programmatically populate a model and then save it to XMI.

Loading logic may retrieve data from multiple sources.
For example:

* A person model element can be loaded from the organization's directory and then enriched with information from, say, ``profile.yml`` located in the person's personal Git repository is such repository and file exist.
* Some information about a software component may be loaded from ``pom.xml``. Information about developers can be loaded as proxies with developer e-mails as proxy URI's. The proxies would be resolved to person objects loaded from the organization's directory. Person objects may have a computed (derived) opposite to "developers" reference of a software component model element. This would allow to list all software components for a given developer. 

As you can see, EMF allows to load data from multiple sources - databases, diagrams, YAML, JSON, Excel, information systems - cross-reference (stitch), validate, and represent as a coherent graph of model elements. 

The data loading logic acts as an [anti-corruption layer](https://www.domainlanguage.com/wp-content/uploads/2016/04/GettingStartedWithDDDWhenSurroundedByLegacySystemsV1.pdf) hiding complexities of data retrieval. 

#### Viewpoint & View

There is a number of ways to define viewpoints for EMF models:

* Eclipse IDE:
    * Tree editors can be generated from metamodels similar to model classes.
    * [Eclipse Sirius](https://www.eclipse.org/sirius/) allows to define multiple representations (viewpoints) - diagrams, trees, tables.
    * [Xtext](https://www.eclipse.org/Xtext/) can be used to develop domain-specific text-based languages based on the metamodel. Such a language can be considered to be a "text-based viewpoint"
    * [JFace Data Binding for EMF](https://www.vogella.com/tutorials/EclipseDataBindingEMF/article.html) can be used to define SWT-based views. Views can be designed in [Eclipse WindowBuilder](https://www.eclipse.org/windowbuilder/).
* Web
    * [Eclipse Sirius Web](https://www.eclipse.org/sirius/sirius-web.html) can be used to create and deploy a graphical studio to the web.
    * [Eclipse RAP](https://www.eclipse.org/rap/) allows to export SWT-based GUI to the Web.
    * [Nasdanika HTML EMF](TODO) ${javadoc/org.nasdanika.html.emf.EObjectActionBuilder} is a base class for creating adapters to generate [Nasdanika HTML App Model](TODO) [Actions](TODO) from model elements. The action model can then be used to generate a static web site. Example - [Drawio Semantic Mapping](https://docs.nasdanika.org/demo-drawio-semantic-mapping/) is generated from a hierarchy of [Composite](TODO)'s. The generation process validates the site for broken links, including links in diagrams. For model elements loaded from Drawio diagrams, source diagrams can be used in the action content. Action content may also contain additional diagrams (sub-views) - Drawio, [PlantUML](https://plantuml.com/) or [Mermaid](https://mermaid.js.org/#/). Example - [Markdown](TODO). Generated sites feature full-text search which includes text from diagram labels and tooltips.        

## Drawio

Drawio diagrams can be used as model resources and as free-form model views (representations) which are not constrained by a viewpoint specification. 

This section provides an overview of Drawio.

* ${javadoc/org.nasdanika.drawio.Document} contains one or more pages.
* ${javadoc/org.nasdanika.drawio.Page} contains ${javadoc/org.nasdanika.drawio.Model}, which in turn contains root. Pages have name and id.
* ${javadoc/org.nasdanika.drawio.Root} has properties and contains one or more layers.
* ${javadoc/org.nasdanika.drawio.Layer} contains layer elements - nodes and connections. Layers have a name (label), properties, and can be hidden.
* ${javadoc/org.nasdanika.drawio.Node} may contain other other nodes and connections. Nodes have a label, tooltip, properties, tags, and incoming and outgoing connections. A node can be linked to a URL or a page. 
* ${javadoc/${javadoc/org.nasdanika.drawio.Connection} may have source and target nodes. Similar to nodes and layers, connections have a label, tooltip, properties, and tags.
* Tags are strings associated with nodes and connections. Similar to layers, tags can be used to hide diagram elements. However, layers contain nodes and connections, and tags have many-to-many relationship with nodes and connections.

See [Nadanika Core Drawio](../core/drawio/index.html) for more details.

Drawio diagrams can be created and edited using the following methods:

* Desktop editor which can be downloaded from [diagrams.net](https://www.diagrams.net/) or installed from [Microsoft Store](https://apps.microsoft.com/store/detail/drawio-diagrams/9MVVSZK43QQW?hl=en-us&gl=us).
* [Online editor](https://app.diagrams.net)
* Hosted editor - deploy [Drawio webapp](https://github.com/jgraph/drawio/tree/dev/src/main/webapp) to a web server. You can modify ``js/viewer-static.min.js`` to point to the URL of your hosted editor - search and replace ``https://app.diagrams.net`` with the URL of your installation.
* Drawio plug-ins, e.g. Confluence plug-in. Drawio diagrams can be exported from Confluence as well as imported to Confluence.

Drawio shapes and diagrams can be added to a user library and that library can be used to author new diagrams.
This feature can be used to create libraries of shapes with pre-configured semantic mapping.

## Comparison of arch prcts approaches

777

Table - 3 columns, multiple views. Maybe in plain html. View to model cardinality as well.

Formal/informal

Pros and cons, why to migrate to nasdaf


## Implementation

|-> graph exploration and exploitation

A path from the informal 

Intranet Drawio viewer and editor with pre-installed libraries, multiple releases. Integration with source control.


Phase/Stage 0 - starting/current state - disconnected diagrams.

Stage 1 - tootips, empty specs for stitching diagrams - multiple diagram elements point to the same semantic element.

Inervals - composite extending Period or phases - named intervals.


Third phase - work packages, gap analysis.











## Conclusion



---

Metrics - total diagrams, total diagram elements, mapped elements, set features, connectedness. Distributions and roll-ups - adoption of the meta-model.
Richness of the metamodel - number of classes, features and operations. 
Analytics - visits, popular pages.

Layers of processing to the scaling up section - graph, multiple models, mapping to Java - implementation types and multiple factories for different contexts/environments.

Capability provided/required model. Supply chains - importance, risks, e.g. expertise scarcity. Key components, teams, people.

Foundational practices - MBSE, Documentation as Code, Video Tutorials, Eclipse Ecosystem - separate white papers?


taxonomy/ontology

Scaling up - Maven package diagrams/models, maven and git URI's, systems integrations via special URI's and resource factories.

faintest pencil

Stage 1 (taxonomy) - consistency across diagrams

Scaling up in the enterprise - .aspx to serve from OneDrive.

Currently a framework, once better understanding of the needs of the org/model - Maven plug-ins to generate.

Java mapping. Implementations, multiple factories for implementations for different environments/contexts. 
Don't have to be runtime. A chain of transformations. May output an artifact for a runtime engine - workflow, integration, ...
The generator may add details (enrich, bind to a particular generation context)
Libraries of shapes - org. specific. And libraries of implementations - environment specific - local development, ...

A quick overview of the Drawio object model and editor capabilities. Layers, tooltips, tags.


URI's vs URL's - custom schemas, resource factories and URI handlers.
E.g. Maven scheme to pull from Maven jars ``maven://<group id>/<artifact id>/<version>/<jar name>/<path in jar>``


Integrations - generic graph. On demand actions for large object sources, e.g. employee directory.

Exporation - meta-model. Exploitation - model. Different teams, different skills.
Interact the meta-model team incrementally elicits the domain model from multiple teams in the trenches.

Phases on the diagram - Manually maintained, extracts from info systems, dynamic content - spa, servlet.

Visio replacement - common good. Also intranet editor and point viewer to it.

All models are wrong... What is right for you at a certain point of time/context

Other extreme - modeling tool, rich notation, not all notation used. Small group, misused notation.

Exporation/exploitation - Gradual adoption of complexity, Stages benefits table, Number of model elements


Dimensions - views (what is consumable), model, meta-model. Meta model utilization. Waste/"attack surface" - abusable. Unused classes (concepts) and attributes.
Assessment - referenceability, up to date, source of truth, versioned.

Tailoring of TOGAF - arch repository, metamodel, views.

Metamodel continuum - tree.

Reusability & enterprise continuum. Metamodel inheritance, horizontal genes transfer. Consumer and corporate - both use Java and Kubernetes, but claim to be very differents - point of divergence, perhaps additional stages.
Dimensions - divisions, regions (US, Canada), sub-regions (e.g. California), Channels - web, mobile, Office. Artificial hierarchy. Application point and application distance. Horizontal reuse and vertical reuse/variability.
Mix-ins and multiple inheritance. 
Suppression of features - annotation, doc, validation.


Mermaild and Plant UML for diagramming with linking - an example? Context diagrams. Keep diagram for now???

framework - nasdaf?


Findable, usable, trustable? DX


Confluence lift and shift

Metamodel elaboration - capture what doesn't fit as docs then migrate to meta-model. E.g. Server supporting team.

Sweet spot of formalism.
Orgs, like people, take time to learn.

TODO - model and gen projects. model name "model", but load key 'nasdaf'. Capability, building block, version, domain, work package, responsibility. 
party, team, person, organization, contact method, ... (gradually).


Arch definition of a code component can be in the same repo with the component - keeping in sync, (arch) documentation.
Maven resource jar

As code - Source control, textual, maven version and dependency

TOGAF inspired, minimalistic, pragmatic, extensible.


When to migrate from informal:

* Debates about terminology - capture as metamodel and publish
* Exorbitant amount of effort on onboarding and KT - document once, have new people to read, ask questions and update.
* Knowledge concentrated in the heads of a few key people (superchickens). 
* Engagement problems - people do not speak up.

Variability and reuse - multi-dimensional continuum.

What - capability
How - building block

===

Since last post solidifed and applied in several real-life scenarios
