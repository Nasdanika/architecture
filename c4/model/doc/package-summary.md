Nasdanika Architecture C4 Model contains classes as explained in the [metamodel](https://c4model.com/#Metamodel) section of the C4 Model home page.

C4 Model classes extend ArchitectureElement and as such inherit temporal aspects - start, end, increments, events.

This model extends the C4 metamodel by:

* Supporting nesting of systems - a [system](System.html) may have sub-systems organized in domains.
* Introducing a concept of a [Module](Module.html) - a building block of a component. Modules can be nested.
* Introducing [Technology](Technology.html) and [TechnologyVersion](TechnologyVersion.html).
