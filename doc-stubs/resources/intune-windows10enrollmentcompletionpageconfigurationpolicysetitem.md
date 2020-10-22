---
title: "windows10EnrollmentCompletionPageConfigurationPolicySetItem resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10EnrollmentCompletionPageConfigurationPolicySetItem resource type

Namespace: microsoft.graph

**TODO: Add Description**


Inherits from [policySetItem](../resources/policysetitem.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem-list.md)|[windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md) collection|Get a list of the [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) objects and their properties.|
|[Create windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem-create.md)|[windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md)|Create a new [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.|
|[Get windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem-get.md)|[windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md)|Read the properties and relationships of a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.|
|[Update windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem-update.md)|[windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md)|Update the properties of a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.|
|[Delete windows10EnrollmentCompletionPageConfigurationPolicySetItem](../api/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem-delete.md)|None|Deletes a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.|

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
|priority|Int32|**TODO: Add Description**|
|status|policySetStatus|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|

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
  "lastModifiedDateTime": "String (timestamp)",
  "payloadId": "String",
  "itemType": "String",
  "displayName": "String",
  "status": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "priority": "Integer"
}
```

