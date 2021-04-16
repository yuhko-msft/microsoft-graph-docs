---
title: "mdmWindowsInformationProtectionPolicyPolicySetItem resource type"
description: "A class containing the properties used for mdm windows information protection policy PolicySetItem."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# mdmWindowsInformationProtectionPolicyPolicySetItem resource type

Namespace: microsoft.graph



A class containing the properties used for mdm windows information protection policy PolicySetItem.


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List mdmWindowsInformationProtectionPolicyPolicySetItems](../api/mdmwindowsinformationprotectionpolicypolicysetitem-list.md)|[mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md) collection|Get a list of the [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md) objects and their properties.|
|[Create mdmWindowsInformationProtectionPolicyPolicySetItem](../api/mdmwindowsinformationprotectionpolicypolicysetitem-create.md)|[mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md)|Create a new [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md) object.|
|[Get mdmWindowsInformationProtectionPolicyPolicySetItem](../api/mdmwindowsinformationprotectionpolicypolicysetitem-get.md)|[mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md)|Read the properties and relationships of a [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md) object.|
|[Update mdmWindowsInformationProtectionPolicyPolicySetItem](../api/mdmwindowsinformationprotectionpolicypolicysetitem-update.md)|[mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md)|Update the properties of a [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md) object.|
|[Delete mdmWindowsInformationProtectionPolicyPolicySetItem](../api/mdmwindowsinformationprotectionpolicypolicysetitem-delete.md)|None|Deletes a [mdmWindowsInformationProtectionPolicyPolicySetItem](../resources/mdmwindowsinformationprotectionpolicypolicysetitem.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|createdDateTime|DateTimeOffset|Creation time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|displayName|String|DisplayName of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|errorCode|errorCode|Error code if any occured. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment Inherited from [policySetItem](../resources/policysetitem.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|itemType|String|policySetType of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|payloadId|String|PayloadId of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|status|policySetStatus|Status of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

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
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "itemType": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "status": "String"
}
```

