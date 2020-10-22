---
title: "networkIPv4ConfigurationManagementCondition resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# networkIPv4ConfigurationManagementCondition resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [networkManagementCondition](../resources/networkmanagementcondition.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List networkIPv4ConfigurationManagementCondition](../api/networkipv4configurationmanagementcondition-list.md)|[networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md) collection|Get a list of the [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md) objects and their properties.|
|[Create networkIPv4ConfigurationManagementCondition](../api/networkipv4configurationmanagementcondition-create.md)|[networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md)|Create a new [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md) object.|
|[Get networkIPv4ConfigurationManagementCondition](../api/networkipv4configurationmanagementcondition-get.md)|[networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md)|Read the properties and relationships of a [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md) object.|
|[Update networkIPv4ConfigurationManagementCondition](../api/networkipv4configurationmanagementcondition-update.md)|[networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md)|Update the properties of a [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md) object.|
|[Delete networkIPv4ConfigurationManagementCondition](../api/networkipv4configurationmanagementcondition-delete.md)|None|Deletes a [networkIPv4ConfigurationManagementCondition](../resources/networkipv4configurationmanagementcondition.md) object.|
|[List managementConditionStatements](../api/networkipv4configurationmanagementcondition-list-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md) collection|Get the managementConditionStatement resources from the managementConditionStatements navigation property.|
|[Add managementConditionStatements](../api/networkipv4configurationmanagementcondition-post-managementconditionstatements.md)|[managementConditionStatement](../resources/intune-managementconditionstatement.md)|Add managementConditionStatements by posting to the managementConditionStatements collection.|
|[Remove managementConditionStatements](../api/networkipv4configurationmanagementcondition-delete-managementconditionstatements.md)|None|Remove a [managementConditionStatement](../resources/intune-managementconditionstatement.md) object.|

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
|ipV4DHCPServer|String|**TODO: Add Description**|
|ipV4DNSServerList|String collection|**TODO: Add Description**|
|ipV4Gateway|String|**TODO: Add Description**|
|ipV4Prefix|String|**TODO: Add Description**|
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
  "@odata.type": "microsoft.graph.networkIPv4ConfigurationManagementCondition",
  "baseType": "microsoft.graph.networkManagementCondition",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.networkIPv4ConfigurationManagementCondition",
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
  "ipV4Prefix": "String",
  "ipV4Gateway": "String",
  "ipV4DHCPServer": "String",
  "ipV4DNSServerList": [
    "String"
  ],
  "dnsSuffixList": [
    "String"
  ]
}
```

