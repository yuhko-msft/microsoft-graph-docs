---
title: "Add accessPackageResource"
description: "Add accessPackageResource by posting to the accessPackageResource collection."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Add accessPackageResource
Namespace: microsoft.graph



Add accessPackageResource by posting to the accessPackageResource collection.

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
POST /identityGovernance/entitlementManagement/accessPackageResourceRequests/{accessPackageResourceRequestId}/accessPackageResource/$ref
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [accessPackageResource](../resources/accesspackageresource.md) object.

The following table shows the properties that are required when you create the [accessPackageResource](../resources/accesspackageresource.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|addedBy|String|**TODO: Add Description**|
|addedOn|DateTimeOffset|**TODO: Add Description**|
|attributes|[accessPackageResourceAttribute](../resources/accesspackageresourceattribute.md) collection|**TODO: Add Description**|
|description|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|isPendingOnboarding|Boolean|**TODO: Add Description**|
|originId|String|**TODO: Add Description**|
|originSystem|String|**TODO: Add Description**|
|resourceType|String|**TODO: Add Description**|
|url|String|**TODO: Add Description**|



## Response

If successful, this method returns a `204 No Content` response code and an [accessPackageResource](../resources/accesspackageresource.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_accesspackageresource_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/identityGovernance/entitlementManagement/accessPackageResourceRequests/{accessPackageResourceRequestId}/accessPackageResource/$ref
Content-Type: application/json
Content-length: 429

{
  "@odata.type": "#microsoft.graph.accessPackageResource",
  "addedBy": "String",
  "addedOn": "String (timestamp)",
  "attributes": [
    {
      "@odata.type": "microsoft.graph.accessPackageResourceAttribute"
    }
  ],
  "description": "String",
  "displayName": "String",
  "isPendingOnboarding": "Boolean",
  "originId": "String",
  "originSystem": "String",
  "resourceType": "String",
  "url": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.accessPackageResource"
}
-->
``` http
HTTP/1.1 204 No Content
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.accessPackageResource",
  "id": "f0f87cf4-7cf4-f0f8-f47c-f8f0f47cf8f0",
  "addedBy": "String",
  "addedOn": "String (timestamp)",
  "attributes": [
    {
      "@odata.type": "microsoft.graph.accessPackageResourceAttribute"
    }
  ],
  "description": "String",
  "displayName": "String",
  "isPendingOnboarding": "Boolean",
  "originId": "String",
  "originSystem": "String",
  "resourceType": "String",
  "url": "String"
}
```

