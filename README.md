
#Wiremock : the serial stubber


##Description

This repository is a learning project on how to use wiremock and cucumber to effectively BDD-style testing your application.
The main idea is to create a testing framework to easily express business case.  

##Usage
```bash
# start the wiremock container
> start-wm

# stop the wiremock container
> stop-wm

# access the admin mappings
http://localhost:15421/__admin/
```
##Backlog
- [ ] add mvn dependencies (junit, wiremock client, cucumber)
- [ ] create a basic hello world call with a unit test
- [ ] create a shopping list dto containing items
- [ ] create a cucumber test that create a nice stub and validate the response
- [ ] create a stub for orders
- [ ] create a stub for books items
- [ ] create a stub for the shipping service
- [ ]  