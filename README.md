# grails-demo
This is a demo of running grails on OpenShift. The demo requires a grails source-to-image image, which can be made in the following steps:
* Go into *s2i-grails*
* Run command *docker build -t grails-centos7 .*

This will create the s2i image

You can then run an image with the following commands
* Run command *s2i build https://github.com/jacobborella/grails-demo grails-centos7 grails-app*
* Run command *docker run -p 8080:8080 grails-app*
This will start up a container with the source code installed. You can of course also refer to your own source repo instead. Mine is just added for convenience.
