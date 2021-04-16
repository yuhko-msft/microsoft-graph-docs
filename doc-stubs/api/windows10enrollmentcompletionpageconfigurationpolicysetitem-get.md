---
title: "Get windows10EnrollmentCompletionPageConfigurationPolicySetItem"
description: "Read the properties and relationships of a windows10EnrollmentCompletionPageConfigurationPolicySetItem object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get windows10EnrollmentCompletionPageConfigurationPolicySetItem
Namespace: microsoft.graph



Read the properties and relationships of a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object.

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
GET /windows10EnrollmentCompletionPageConfigurationPolicySetItem
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [windows10EnrollmentCompletionPageConfigurationPolicySetItem](../resources/windows10enrollmentcompletionpageconfigurationpolicysetitem.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_windows10enrollmentcompletionpageconfigurationpolicysetitem"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/windows10EnrollmentCompletionPageConfigurationPolicySetItem
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
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
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
}
```

