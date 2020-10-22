---
title: "Update windows10EnrollmentCompletionPageConfigurationPolicySetItem"
description: "Update the properties of a windows10EnrollmentCompletionPageConfigurationPolicySetItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update windows10EnrollmentCompletionPageConfigurationPolicySetItem
Namespace: microsoft.graph

Update the properties of a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.

## Permissions
One of the following permissions is required to call this API. To learn more, including how to choose permissions, see [Permissions](/graph/permissions-reference).

|Permission type|Permissions (from most to least privileged)|
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
PATCH /windows10EnrollmentCompletionPageConfigurationPolicySetItem
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.

The following table shows the properties that are required when you create the [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|payloadId|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|itemType|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|displayName|String|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|status|policySetStatus|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `unknown`, `validating`, `partialSuccess`, `success`, `error`, `notAssigned`.|
|errorCode|errorCode|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md). Possible values are: `noError`, `unauthorized`, `notFound`, `deleted`.|
|guidedDeploymentTags|String collection|**TODO: Add Description** Inherited from [policySetItem](../resources/intune-policysetitem.md)|
|priority|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/intune-windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_windows10enrollmentcompletionpageconfigurationpolicysetitem"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/windows10EnrollmentCompletionPageConfigurationPolicySetItem
Content-Type: application/json
Content-length: 304

{
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem",
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


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "@odata.type": "#microsoft.graph.windows10EnrollmentCompletionPageConfigurationPolicySetItem",
  "id": "9d39b30f-b30f-9d39-0fb3-399d0fb3399d",
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

