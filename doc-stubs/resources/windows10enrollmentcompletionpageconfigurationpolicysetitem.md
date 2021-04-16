---
title: "windows10EnrollmentCompletionPageConfigurationPolicySetItem resource type"
description: "A class containing the properties used for Windows10EnrollmentCompletionPageConfiguration PolicySetItem."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10EnrollmentCompletionPageConfigurationPolicySetItem resource type

Namespace: microsoft.graph



A class containing the properties used for Windows10EnrollmentCompletionPageConfiguration PolicySetItem.


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/windows10enrollmentcompletionpageconfigurationpolicysetitem-list.md)|[windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) collection|Get a list of the [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) objects and their properties.|
|[Create windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/windows10enrollmentcompletionpageconfigurationpolicysetitem-create.md)|[windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md)|Create a new [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.|
|[Get windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/windows10enrollmentcompletionpageconfigurationpolicysetitem-get.md)|[windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md)|Read the properties and relationships of a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.|
|[Update windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/windows10enrollmentcompletionpageconfigurationpolicysetitem-update.md)|[windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md)|Update the properties of a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.|
|[Delete windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/windows10enrollmentcompletionpageconfigurationpolicysetitem-delete.md)|None|Deletes a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.|

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
|priority|Int32|Priority of the Windows10EnrollmentCompletionPageConfigurationPolicySetItem.|
|status|policySetStatus|Status of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem",
  "baseType": "microsoft.graph.policySetItem",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem",
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
  "priority": "Integer"
}
```

