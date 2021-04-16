---
title: "networkIPv6ConfigurationManagementCondition resource type"
description: "IPv6 configuration-based management conditions may be defined that will trigger when a device detects certain IP network settings. An IP config management condition will only be considered TRUE when the network connection is active.
IPv6 DHCP server addresses may not be matched. This is because Windows(circa Redstone) does not expose this information to the Natural Authentication service."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# networkIPv6ConfigurationManagementCondition resource type

Namespace: microsoft.graph



IPv6 configuration-based management conditions may be defined that will trigger when a device detects certain IP network settings. An IP config management condition will only be considered TRUE when the network connection is active.
IPv6 DHCP server addresses may not be matched. This is because Windows(circa Redstone) does not expose this information to the Natural Authentication service.


Inherits from [networkManagementCondition](../resources/networkmanagementcondition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-list.md)|[networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) collection|Get a list of the [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) objects and their properties.|
|[Create networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-create.md)|[networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md)|Create a new [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.|
|[Get networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-get.md)|[networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md)|Read the properties and relationships of a [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.|
|[Update networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-update.md)|[networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md)|Update the properties of a [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.|
|[Delete networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-delete.md)|None|Deletes a [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.|
|[List managementConditionStatements](../api/networkipv6configurationmanagementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatement](../api/networkipv6configurationmanagementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicablePlatforms|devicePlatformType collection|The applicable platforms for this management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|createdDateTime|DateTimeOffset|The time the management condition was created. Generated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|description|String|The admin defined description of the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|displayName|String|The admin defined name of the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|
|dnsSuffixList|String collection|Valid DNS suffixes for the current network. e.g. seattle.contoso.com|
|eTag|String|ETag of the management condition. Updated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|ipV6DNSServerList|String collection|An IPv6 DNS servers configured for the adapter.|
|ipV6Gateway|String|The IPv6 gateway address to. e.g 2001:db8::1|
|ipV6Prefix|String|The IPv6 subnet to be connected to. e.g. 2001:db8::/32|
|modifiedDateTime|DateTimeOffset|The time the management condition was last modified. Updated service side. Inherited from [managementCondition](../resources/managementcondition.md)|
|uniqueName|String|Unique name for the management condition. Used in management condition expressions. Inherited from [managementCondition](../resources/managementcondition.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managementConditionStatements|[managementConditionStatement](../resources/managementconditionstatement.md) collection|The management condition statements associated to the management condition. Inherited from [managementCondition](../resources/managementcondition.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.networkIPv6ConfigurationManagementCondition",
  "baseType": "microsoft.graph.networkManagementCondition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.networkIPv6ConfigurationManagementCondition",
  "id": "String (identifier)",
  "applicablePlatforms": [
    "String"
  ],
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "eTag": "String",
  "modifiedDateTime": "String (timestamp)",
  "uniqueName": "String",
  "dnsSuffixList": [
    "String"
  ],
  "ipV6DNSServerList": [
    "String"
  ],
  "ipV6Gateway": "String",
  "ipV6Prefix": "String"
}
```

