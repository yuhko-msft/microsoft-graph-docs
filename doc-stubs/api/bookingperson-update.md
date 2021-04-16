---
title: "Update bookingPerson"
description: "Update the properties of a bookingPerson object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update bookingPerson
Namespace: microsoft.graph



Update the properties of a [bookingPerson](../resources/bookingperson.md) object.

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
PATCH /bookingPerson
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [bookingPerson](../resources/bookingperson.md) object.

The following table shows the properties that are required when you update the [bookingPerson](../resources/bookingperson.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|Display name of this entity.
The display name is suitable for human-readable interfaces. Inherited from [bookingNamedEntity](../resources/bookingnamedentity.md)|
|emailAddress|String|The e-mail address of this person.|



## Response

If successful, this method returns a `200 OK` response code and an updated [bookingPerson](../resources/bookingperson.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_bookingperson"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/bookingPerson
Content-Type: application/json
Content-length: 112

{
  "@odata.type": "#microsoft.graph.bookingPerson",
  "displayName": "String",
  "emailAddress": "String"
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
  "@odata.type": "#microsoft.graph.bookingPerson",
  "id": "d005fcc3-fcc3-d005-c3fc-05d0c3fc05d0",
  "displayName": "String",
  "emailAddress": "String"
}
```

