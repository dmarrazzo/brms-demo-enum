Red Had JBoss BRMS Enumeration demo
===================================

This is a demo project to show the enumeration capabilities.

Noteworthy
----------

The [enumeration definition file](enum-rules/src/main/resources/enumDef.enumeration):

	'Address.zone' : ['A', 'B', 'C']
	'Address.country' : (new helper.EnumDataSource()).getListOfCountries()
	'Address.city[country]' : '(new helper.EnumDataSource()).getListOfCities("@{country}")'

The Enumeration Helper class that contains the implementation of the method referred in the previous file.

[EnumDataSource](enum-rules/src/main/java/helper/EnumDataSource.java)


Data Model
----------

[Address](enum-rules/src/main/java/example/Address.java)  

Decision Table
--------------

[ZoneDT](enum-rules/src/main/resources/SpreadDT.gdst)
