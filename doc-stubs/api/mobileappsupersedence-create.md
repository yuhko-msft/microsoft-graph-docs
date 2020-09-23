---
title: "Create mobileAppSupersedence"
description: "Create a new mobileAppSupersedence object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create mobileAppSupersedence
Namespace: microsoft.graph

Create a new [mobileAppSupersedence](../resources/mobileappsupersedence.md) object.

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
POST ** Collection URI for microsoft.management.services.api.mobileAppSupersedence not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [mobileAppSupersedence](../resources/mobileappsupersedence.md) object.

The following table shows the properties that are required when you create the [mobileAppSupersedence](../resources/mobileappsupersedence.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|The relationship entity id. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetId|String|The target mobile app's app id. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetDisplayName|String|The target mobile app's display name. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md)|
|targetType|mobileAppRelationshipType|The type of relationship indicating whether the target is a parent or child. Inherited from [mobileAppRelationship](../resources/mobileapprelationship.md). Possible values are: `child`, `parent`.|
|supersedenceType|mobileAppSupersedenceType|The supersedence relationship type between the parent and child apps. Possible values are: `update`, `replace`.|
|supersededAppCount|Int32|The total number of apps directly or indirectly superseded by the child app.|
|supersedingAppCount|Int32|The total number of apps directly or indirectly superseding the parent app.|



## Response

If successful, this method returns a `201 Created` response code and a [mobileAppSupersedence](../resources/mobileappsupersedence.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_mobileappsupersedence_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.mobileAppSupersedence not found
Content-Type: application/json
Content-length: 273

{
  "@odata.type": "#microsoft.management.services.api.mobileAppSupersedence",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetType": "String",
  "supersedenceType": "String",
  "supersededAppCount": "Integer",
  "supersedingAppCount": "Integer"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.management.services.api.mobileAppSupersedence"
}
-->
``` http
HTTP/1.1 201 Created

Content-Type: application/json
{
  "@odata.type": "#microsoft.management.services.api.mobileAppSupersedence",
  "id": "c03105bb-05bb-c031-bb05-31c0bb0531c0",
  "targetId": "String",
  "targetDisplayName": "String",
  "targetType": "String",
  "supersedenceType": "String",
  "supersededAppCount": "Integer",
  "supersedingAppCount": "Integer"
}
```

