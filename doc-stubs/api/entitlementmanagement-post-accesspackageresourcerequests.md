---
title: "Create accessPackageResourceRequests"
description: "Create a new accessPackageResourceRequest object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create accessPackageResourceRequests
Namespace: microsoft.graph

Create a new accessPackageResourceRequest object.

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
|id|String|**TODO: Add Description**|
|catalogId|String|**TODO: Add Description**|
|executeImmediately|Boolean|**TODO: Add Description**|
|isValidationOnly|Boolean|**TODO: Add Description**|
|requestType|String|**TODO: Add Description**|
|requestState|String|**TODO: Add Description**|
|requestStatus|String|**TODO: Add Description**|
|expirationDateTime|DateTimeOffset|**TODO: Add Description**|
|justification|String|**TODO: Add Description**|



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
POST https://graph.microsoft.com/beta/identityGovernance/entitlementManagement/accessPackageResourceRequests
Content-Type: application/json
Content-length: 357

{
  "@odata.type": "#Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageResourceRequest",
  "catalogId": "String",
  "executeImmediately": "Boolean",
  "isValidationOnly": "Boolean",
  "requestType": "String",
  "requestState": "String",
  "requestStatus": "String",
  "expirationDateTime": "String (timestamp)",
  "justification": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageResourceRequest"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#Microsoft.IGAELM.EC.FrontEnd.ExternalModel.accessPackageResourceRequest",
  "id": "b8d135a2-35a2-b8d1-a235-d1b8a235d1b8",
  "catalogId": "String",
  "executeImmediately": "Boolean",
  "isValidationOnly": "Boolean",
  "requestType": "String",
  "requestState": "String",
  "requestStatus": "String",
  "expirationDateTime": "String (timestamp)",
  "justification": "String"
}
```

