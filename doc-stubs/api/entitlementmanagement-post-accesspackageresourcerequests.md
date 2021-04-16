---
title: "Create accessPackageResourceRequest"
description: "Create a new accessPackageResourceRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create accessPackageResourceRequest
Namespace: microsoft.graph



Create a new accessPackageResourceRequest object.

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
POST /identityGovernance/entitlementManagement/accessPackageResourceRequests
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessPackageResourceRequest](../resources/accesspackageresourcerequest.md) object.

The following table shows the properties that are required when you create the [accessPackageResourceRequest](../resources/accesspackageresourcerequest.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|catalogId|String|**TODO: Add Description**|
|executeImmediately|Boolean|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|isValidationOnly|Boolean|**TODO: Add Description**|
|justification|String|**TODO: Add Description**|
|requestState|String|**TODO: Add Description**|
|requestStatus|String|**TODO: Add Description**|
|requestType|String|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and an [accessPackageResourceRequest](../resources/accesspackageresourcerequest.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_accesspackageresourcerequest_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageResourceRequests
Content-Type: application/json
Content-length: 330

{
  "@odata.type": "#microsoft.graph.accessPackageResourceRequest",
  "catalogId": "String",
  "executeImmediately": "Boolean",
  "expirationDateTime": "String (timestamp)",
  "isValidationOnly": "Boolean",
  "justification": "String",
  "requestState": "String",
  "requestStatus": "String",
  "requestType": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.accessPackageResourceRequest"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.accessPackageResourceRequest",
  "id": "4e538715-8715-4e53-1587-534e1587534e",
  "catalogId": "String",
  "executeImmediately": "Boolean",
  "expirationDateTime": "String (timestamp)",
  "isValidationOnly": "Boolean",
  "justification": "String",
  "requestState": "String",
  "requestStatus": "String",
  "requestType": "String"
}
```

