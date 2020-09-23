---
title: "Update relationships"
description: "Update the properties of a relationships object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update relationships
Namespace: microsoft.graph

Update the properties of a relationships object.

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
PATCH /deviceAppManagement/mobileApps/{mobileAppId}/relationships
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppRelationship](../resources/mobileapprelationship.md) object.

The following table shows the properties that are required when you create the [mobileAppRelationship](../resources/mobileapprelationship.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The relationship entity id.|
|targetId|String|The target mobile app's app id.|
|targetDisplayName|String|The target mobile app's display name.|
|targetType|mobileAppRelationshipType|The type of relationship indicating whether the target is a parent or child. Possible values are: `child`, `parent`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileAppRelationship](../resources/mobileapprelationship.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_relationships"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/deviceAppManagement/mobileApps/{mobileAppId}/relationships
Content-Type: application/json
Content-length: 149

{
  "@odata.type": "#microsoft.graph.mobileAppRelationship",
  "targetId": "String",
  "targetDisplayName": "String",
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
  "id": "35f9f499-f499-35f9-99f4-f93599f4f935",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetType": "String"
}
```

