A container represents an **application** or a **data store**.
A container is something that needs to be running in order for the overall software system to work. In real terms, a container is something like:

* **Server-side web application**: A Java EE web application running on Apache Tomcat, an ASP.NET MVC application running on Microsoft IIS, a Ruby on Rails application running on WEBrick, a Node.js application, etc.
* **Client-side web application**: A JavaScript application running in a web browser using Angular, Backbone.JS, jQuery, etc.
* **Client-side desktop application**: A Windows desktop application written using WPF, an OS X desktop application written using Objective-C, a cross-platform desktop application written using JavaFX, etc.
* **Mobile app**: An Apple iOS app, an Android app, a Microsoft Windows Phone app, etc.
* **Server-side console application**: A standalone (e.g. "public static void main") application, a batch process, etc.
* **Serverless function**: A single serverless function (e.g. Amazon Lambda, Azure Function, etc).
* **Database**: A schema or database in a relational database management system, document store, graph database, etc such as MySQL, Microsoft SQL Server, Oracle Database, MongoDB, Riak, Cassandra, Neo4j, etc.
* **Blob or content store**: A blob store (e.g. Amazon S3, Microsoft Azure Blob Storage, etc) or content delivery network (e.g. Akamai, Amazon CloudFront, etc).
* **File system**: A full local file system or a portion of a larger networked file system (e.g. SAN, NAS, etc).
* **Shell script**: A single shell script written in Bash, etc.
* **etc**

A container is essentially a context or boundary inside which some code is executed or some data is stored.
And each container is a separately deployable/runnable thing or runtime environment, typically (but not always) running in its own process space.
Because of this, communication between containers typically takes the form of an inter-process communication.

