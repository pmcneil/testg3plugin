This plugin demonstrates a problem I found calling grails schema-export.

# Setup

* Clone this project
* create a new local postgresql database called testg3 (or edit conf/application.groovy)
* try running `grails run-command schema-export`

If you are replicating the issue you should get:
 
 `Command execution error: org.hibernate.tool.hbm2ddl.SchemaExport: method <init>()V not found`

If you use this plugin in an application and try `grails schema-export` it will work fine.

# Info

this uses:

* compile "org.grails.plugins:hibernate5:6.1.12"
* compile "org.hibernate:hibernate-ehcache"
* compile "org.postgresql:postgresql:42.2.1"

and sets

```$xslt 
buildscript {
   ...
              dependencies {
                 ...
                 classpath "org.grails.plugins:hibernate5:${gormVersion-".RELEASE"}"
             }
         }
```
 