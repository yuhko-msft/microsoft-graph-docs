---
title: "Create windows10EnrollmentCompletionPageConfigurationPolicySetItem"
description: "Create a new windows10EnrollmentCompletionPageConfigurationPolicySetItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create windows10EnrollmentCompletionPageConfigurationPolicySetItem
Namespace: microsoft.graph



Create a new [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from least to most privileged)|
|:---|:---|
|Delegated (work or school account)|**TODO: Provide applicable permissions.**|
|Delegated (personal Microsoft account)|**TODO: Provide applicable permissions.**|
|Application|**TODO: Provide applicable permissions.**|

## HTTP request

<!-- {
  "blockType": "ignored"
}
-->
``` http
POST ** Collection URI for microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.

The following table shows the properties that are required when you create the [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|Creation time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|displayName|String|DisplayName of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|errorCode|errorCode|Error code if any occured. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|Tags of the guided deployment Inherited from [policySetItem](../resources/policysetitem.md)|
|itemType|String|policySetType of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|Last modified time of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|payloadId|String|PayloadId of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md)|
|status|policySetStatus|Status of the PolicySetItem. Inherited from [policySetItem](../resources/policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|
|priority|Int32|Priority of the Windows10EnrollmentCompletionPageConfigurationPolicySetItem.|



## Response

If successful, this method returns a `201 Created` response code and a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_windows10enrollmentcompletionpageconfigurationpolicysetitem_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem not found
Content-Type: application/json
Content-length: 304

{
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem",
  "displayName": "String",
  "errorCode": "String",
  "guidedDeploymentTags": [
    "String"
  ],
  "itemType": "String",
  "payloadId": "String",
  "status": "String",
  "priority": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem",
  "id": "cea6c81d-c81d-cea6-1dc8-a6ce1dc8a6ce",
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

