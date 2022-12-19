Abstract - why the name is "Architecture As Code". Nasdanika Architectural Framework (NASDAF)
Application of open source products, including Nasdanika products, to architecture developent.
Comparison with two alternatives - an informal, and a formal using UML/Sparx Enterprise Architect.

Java11/Eclipse IDE with support of Ecore model development - J2ee or modeling. metamodel
For modeling - text editor, Maven to generate

[TOC levels=6]

## Demo

Link to the demo, demo docs - how it is done. Short summary here.
Composite.


## Architecture practice

Reference [TOGAF](https://en.wikipedia.org/wiki/The_Open_Group_Architecture_Framework).

Components with descriptions

* **[Metamodel](https://en.wikipedia.org/wiki/Metamodeling)** - contains specifications of types of "things" a.k.a. "concepts", "entities", "model elements". For example "Server" is a type of thing. Server specification may define that a server has an IP address attribute, a one-to-many containment relationship with "Hard Drive", and many-to-one non-containment "supportTeam" relationship with a "Team". 
* **Model** - contains descriptions of things (entities, instances, model elements). The descriptions comply with the meta-model specifications. For example, a model may contain multiple server model elements with different IP addresses, but possibly referencing the same support team model element.
* **Viewpoint** - a specification how model elements shall be represented (shown). For [UML](https://en.wikipedia.org/wiki/Unified_Modeling_Language) diagrams it would be a diagram type, e.g. [Component diagram](https://en.wikipedia.org/wiki/Component_diagram). Viewpoint is a meta-view. 
* **View** - a representation of model elements, possibly compliant with a viewpoint specification. A view can be graphical (diagram, chart), textual - a list, or a table (matrix), or be built from UI components such as trees and forms.
* **Repository** - a storage of models.   

### NASDAF 

This section provides an overview of NASDAF architecture practice components. 

#### Metamodel

NASDAF uses [Eclipse Modeling Framework](https://www.eclipse.org/modeling/emf/) [Ecore](https://download.eclipse.org/modeling/emf/emf/javadoc/2.9.0/org/eclipse/emf/ecore/package-summary.html#details) to define the meta-model.
This section provides an overview of Ecore concepts.

* **EMF Project** - contains one or more Ecore models and generator models. Generator models are used to generate Java classes from models. Java classes are then compiled and can be deployed to a Maven repository. E.g. [Maven Central](https://mvnrepository.com/repos/central). 
* **Ecore model** - contains one or more EPackages.
* **EPackage** - a grouping construct, contains EClassifiers (EClass, EDataElement, EEnum) and sub-packages.
* **EClass** - defines a "type of thing", e.g. "Server". Contains structural features - attributes and references, and operations. E.g. "Server".
* **EStructuralFeature** - an attribute or a reference. Can be single value on multi-value.  
    **EAttribute** - simple value, e.g. a string, number, date. E.g. 

EMF Ecore project - one or more ecore models.

Model - EPackage containing sub-packages and classifiers - classes, enumerations, and data types

Eclasses - structural features and operations. Example - server, hard drive, team, person
structural features - one or many, changeable, computed (derived)
attributes - examples
references - example - has hard drives, maintained. Containment, cardinality, opposite
operations - example - restart, patch

generation to java, packaging and publishing to Maven jars

generation of documentation with ecoredoc, cross-referencing. markdown
Doc elements - doc, diagram (auto-generated), all references, all supertypes, load specification.
Examples from app.

Publishing - Github pages.

Examples - Ncore, Exec, Flow, app, ...

Ubiquitous language, problem-domain/org specific.

validations - ip address uniquiness

#### Model

XMI, Drawio, YAML, JSON, Excel, databases - CDO, EMF graph4j or whatever neoemf.
Custom URI schemas for loading from classloader, Maven, ...

#### Viewpoint

#### View

Drawio - In browser, desktop, confluence (bi-dir exchange), integrations.
Drawio


A section on Drawio model and capabilities, layers - mention that some people who use Drawio are not aware of many of its capabilities. Link to documentation incl. shortcuts.
Generation is essentially model transformation. Transformation pipeline - drawio -> semantic -> app -> resource -> container.

Mermaid, PlantUML.

View to model cardinality

Sirius (Web), Xtext, forms, trees. 

#### Repository

Distributed - Filesystem, Git, Maven, database

## Comparison of arch prcts approaches

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




Metamodel elaboration - capture what doesn't fit as docs then migrate to meta-model. E.g. Server supporting team.

Sweet spot of formalism.
Orgs, like people, take time to learn.

===

Since last post solidifed and applied in several real-life scenarios
