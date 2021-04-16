---
title: "Update mobileAppRelationship"
description: "Update the properties of a mobileAppRelationship object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mobileAppRelationship
Namespace: microsoft.graph



Update the properties of a [mobileAppRelationship](../resources/mobileapprelationship.md) object.

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
PATCH /deviceAppManagement/mobileApps/{mobileAppId}/relationships/{mobileAppRelationshipId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppRelationship](../resources/mobileapprelationship.md) object.

The following table shows the properties that are required when you update the [mobileAppRelationship](../resources/mobileapprelationship.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetDisplayName|String|The target mobile app's display name.|
|targetDisplayVersion|String|The target mobile app's display version.|
|targetId|String|The target mobile app's app id.|
|targetPublisher|String|The target mobile app's publisher.|
|targetType|mobileAppRelationshipType|The type of relationship indicating whether the target is a parent or child. Possible values are: `child`, `parent`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileAppRelationship](../resources/mobileapprelationship.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mobileapprelationship"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/deviceAppManagement/mobileApps/{mobileAppId}/relationships/{mobileAppRelationshipId}
Content-Type: application/json
Content-length: 218

{
  "@odata.type": "#microsoft.graph.mobileAppRelationship",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetId": "String",
  "targetPublisher": "String",
  "targetType": "String"
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
  "@odata.type": "#microsoft.graph.mobileAppRelationship",
  "id": "38184b4a-4b4a-3818-4a4b-18384a4b1838",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetId": "String",
  "targetPublisher": "String",
  "targetType": "String"
}
```

