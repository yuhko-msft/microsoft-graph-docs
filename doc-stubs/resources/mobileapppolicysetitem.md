---
title: "mobileAppPolicySetItem resource type"
description: "A class containing the properties used for mobile app PolicySetItem."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppPolicySetItem resource type

Namespace: microsoft.graph



A class containing the properties used for mobile app PolicySetItem.


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileAppPolicySetItems](../api/mobileapppolicysetitem-list.md)|[mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md) collection|Get a list of the [mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md) objects and their properties.|
|[Create mobileAppPolicySetItem](../api/mobileapppolicysetitem-create.md)|[mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md)|Create a new [mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md) object.|
|[Get mobileAppPolicySetItem](../api/mobileapppolicysetitem-get.md)|[mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md)|Read the properties and relationships of a [mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md) object.|
|[Update mobileAppPolicySetItem](../api/mobileapppolicysetitem-update.md)|[mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md)|Update the properties of a [mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md) object.|
|[Delete mobileAppPolicySetItem](../api/mobileapppolicysetitem-delete.md)|None|Deletes a [mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Creation time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|displayName|String|DisplayName of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|errorCode|errorCode|Error code if any occured. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment Inherited from [policySetItem](../resources/policysetitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intent|installIntent|Install intent of the MobileAppPolicySetItem. Possible values are: `available`, `required`, `uninstall`, `availableWithoutEnrollment`.|
|itemType|String|policySetType of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|payloadId|String|PayloadId of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|settings|[mobileAppAssignmentSettings](../resources/mobileappassignmentsettings.md)|Settings of the MobileAppPolicySetItem.|
|status|policySetStatus|Status of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mobileAppPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mobileAppPolicySetItem",
  "id": "String (identifier)",
  "createdDateTime": "String (timestamp)",
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "itemType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "status": "String",
  "intent": "String",
  "settings": {
    "@odata.type": "microsoft.graph.mobileAppAssignmentSettings"
  }
}
```

