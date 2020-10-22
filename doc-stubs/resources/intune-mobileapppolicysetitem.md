---
title: "mobileAppPolicySetItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mobileAppPolicySetItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mobileAppPolicySetItems](../api/intune-mobileapppolicysetitem-list.md)|[mobileAppPolicySetItem](../resources/intune-mobileapppolicysetitem.md) collection|Get a list of the [mobileAppPolicySetItem](../resources/mobileapppolicysetitem.md) objects and their properties.|
|[Create mobileAppPolicySetItem](../api/intune-mobileapppolicysetitem-create.md)|[mobileAppPolicySetItem](../resources/intune-mobileapppolicysetitem.md)|Create a new [mobileAppPolicySetItem](../resources/intune-mobileapppolicysetitem.md) object.|
|[Get mobileAppPolicySetItem](../api/intune-mobileapppolicysetitem-get.md)|[mobileAppPolicySetItem](../resources/intune-mobileapppolicysetitem.md)|Read the properties and relationships of a [mobileAppPolicySetItem](../resources/intune-mobileapppolicysetitem.md) object.|
|[Update mobileAppPolicySetItem](../api/intune-mobileapppolicysetitem-update.md)|[mobileAppPolicySetItem](../resources/intune-mobileapppolicysetitem.md)|Update the properties of a [mobileAppPolicySetItem](../resources/intune-mobileapppolicysetitem.md) object.|
|[Delete mobileAppPolicySetItem](../api/intune-mobileapppolicysetitem-delete.md)|None|Deletes a [mobileAppPolicySetItem](../resources/intune-mobileapppolicysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|displayName|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|errorCode|errorCode|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|intent|installIntent|**TODO: Add Description**. Possible values are: `available`, `required`, `uninstall`, `availableWithoutEnrollment`.|
|itemType|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|payloadId|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|settings|[mobileAppAssignmentSettings](../resources/intune-mobileappassignmentsettings.md)|**TODO: Add Description**|
|status|policySetStatus|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

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
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "itemType": "String",
  "displayName": "String",
  "status": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "intent": "String",
  "settings": {
    "@odata.type": "microsoft.graph.mobileAppAssignmentSettings"
  }
}
```

