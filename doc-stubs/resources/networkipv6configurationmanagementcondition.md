---
title: "networkIPv6ConfigurationManagementCondition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# networkIPv6ConfigurationManagementCondition resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [networkManagementCondition](../resources/networkmanagementcondition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-list.md)|[networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) collection|Get a list of the [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) objects and their properties.|
|[Create networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-create.md)|[networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md)|Create a new [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.|
|[Get networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-get.md)|[networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md)|Read the properties and relationships of a [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.|
|[Update networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-update.md)|[networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md)|Update the properties of a [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.|
|[Delete networkIPv6ConfigurationManagementCondition](../api/networkipv6configurationmanagementcondition-delete.md)|None|Deletes a [networkIPv6ConfigurationManagementCondition](../resources/networkipv6configurationmanagementcondition.md) object.|
|[List managementConditionStatements](../api/networkipv6configurationmanagementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatements](../api/networkipv6configurationmanagementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|
|[Remove managementConditionStatements](../api/networkipv6configurationmanagementcondition-delete-managementconditionstatements.md)|None|Remove a [managementConditionStatement](../resources/intune-managementconditionstatement.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|applicablePlatforms|devicePlatformType collection|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|description|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|displayName|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|dnsSuffixList|String collection|**TODO: Add Description**|
|eTag|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|ipV6DNSServerList|String collection|**TODO: Add Description**|
|ipV6Gateway|String|**TODO: Add Description**|
|ipV6Prefix|String|**TODO: Add Description**|
|modifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|
|uniqueName|String|**TODO: Add Description** Inherited from [managementCondition](../resources/intune-managementcondition.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|managementConditionStatements|[managementConditionStatement](../resources/intune-managementconditionstatement.md) collection|**TODO: Add Description** Inherited from [managementCondition](../resources/managementcondition.md)|

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
  "uniqueName": "String",
  "displayName": "String",
  "description": "String",
  "createdDateTime": "String (timestamp)",
  "modifiedDateTime": "String (timestamp)",
  "eTag": "String",
  "applicablePlatforms": [
    "String"
  ],
  "ipV6Prefix": "String",
  "ipV6Gateway": "String",
  "ipV6DNSServerList": [
    "String"
  ],
  "dnsSuffixList": [
    "String"
  ]
}
```

