---
title: "mdmWindowsInformationProtectionPolicyPolicySetItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mdmWindowsInformationProtectionPolicyPolicySetItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mdmWindowsInformationProtectionPolicyPolicySetItems](../api/intune-mdmwindowsinformationprotectionpolicypolicysetitem-list.md)|[mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/intune-mdmwindowsinformationprotectionpolicypolicysetitem.md) collection|Get a list of the [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md) objects and their properties.|
|[Create mdmWindowsInformationProtectionPolicyPolicySetItem](../api/intune-mdmwindowsinformationprotectionpolicypolicysetitem-create.md)|[mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/intune-mdmwindowsinformationprotectionpolicypolicysetitem.md)|Create a new [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/intune-mdmwindowsinformationprotectionpolicypolicysetitem.md) object.|
|[Get mdmWindowsInformationProtectionPolicyPolicySetItem](../api/intune-mdmwindowsinformationprotectionpolicypolicysetitem-get.md)|[mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/intune-mdmwindowsinformationprotectionpolicypolicysetitem.md)|Read the properties and relationships of a [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/intune-mdmwindowsinformationprotectionpolicypolicysetitem.md) object.|
|[Update mdmWindowsInformationProtectionPolicyPolicySetItem](../api/intune-mdmwindowsinformationprotectionpolicypolicysetitem-update.md)|[mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/intune-mdmwindowsinformationprotectionpolicypolicysetitem.md)|Update the properties of a [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/intune-mdmwindowsinformationprotectionpolicypolicysetitem.md) object.|
|[Delete mdmWindowsInformationProtectionPolicyPolicySetItem](../api/intune-mdmwindowsinformationprotectionpolicypolicysetitem-delete.md)|None|Deletes a [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/intune-mdmwindowsinformationprotectionpolicypolicysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|displayName|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|errorCode|errorCode|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|itemType|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|payloadId|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|status|policySetStatus|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.mdmWindowsInformationProtectionPolicyPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.mdmWindowsInformationProtectionPolicyPolicySetItem",
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
  ]
}
```

