---
title: "Update mobileAppSupersedence"
description: "Update the properties of a mobileAppSupersedence object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update mobileAppSupersedence
Namespace: microsoft.graph



Update the properties of a [mobileAppSupersedence](../resources/mobileappsupersedence.md) object.

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
PATCH /mobileAppSupersedence
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppSupersedence](../resources/mobileappsupersedence.md) object.

The following table shows the properties that are required when you update the [mobileAppSupersedence](../resources/mobileappsupersedence.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|targetDisplayName|String|The target mobile app's display name. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetDisplayVersion|String|The target mobile app's display version. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetId|String|The target mobile app's app id. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetPublisher|String|The target mobile app's publisher. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetType|mobileAppRelationshipType|The type of relationship indicating whether the target is a parent or child. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md). Possible values are: `child`, `parent`.|
|supersededAppCount|Int32|The total number of apps directly or indirectly superseded by the child app.|
|supersedenceType|mobileAppSupersedenceType|The supersedence relationship type between the parent and child apps. Possible values are: `update`, `replace`.|
|supersedingAppCount|Int32|The total number of apps directly or indirectly superseding the parent app.|



## Response

If successful, this method returns a `200 OK` response code and an updated [mobileAppSupersedence](../resources/mobileappsupersedence.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_mobileappsupersedence"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/mobileAppSupersedence
Content-Type: application/json
Content-length: 324

{
  "@odata.type": "#microsoft.graph.mobileAppSupersedence",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetId": "String",
  "targetPublisher": "String",
  "targetType": "String",
  "supersededAppCount": "Integer",
  "supersedenceType": "String",
  "supersedingAppCount": "Integer"
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
  "@odata.type": "#microsoft.graph.mobileAppSupersedence",
  "id": "d4e8d79a-d79a-d4e8-9ad7-e8d49ad7e8d4",
  "targetDisplayName": "String",
  "targetDisplayVersion": "String",
  "targetId": "String",
  "targetPublisher": "String",
  "targetType": "String",
  "supersededAppCount": "Integer",
  "supersedenceType": "String",
  "supersedingAppCount": "Integer"
}
```

