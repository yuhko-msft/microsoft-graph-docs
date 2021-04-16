---
title: "Update bookingStaffMember"
description: "Update the properties of a bookingStaffMember object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update bookingStaffMember
Namespace: microsoft.graph



Update the properties of a [bookingStaffMember](../resources/bookingstaffmember.md) object.

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
PATCH /bookingBusinesses/{bookingBusinessesId}/staffMembers/{bookingStaffMemberId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [bookingStaffMember](../resources/bookingstaffmember.md) object.

The following table shows the properties that are required when you update the [bookingStaffMember](../resources/bookingstaffmember.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|displayName|String|Display name of this entity.
The display name is suitable for human-readable interfaces. Inherited from [bookingNamedEntity](../resources/bookingnamedentity.md)|
|emailAddress|String|The e-mail address of this person. Inherited from [bookingPerson](../resources/bookingperson.md)|
|availabilityIsAffectedByPersonalCalendar|Boolean|**TODO: Add Description**|
|colorIndex|Int32|**TODO: Add Description**|
|role|bookingStaffRole|**TODO: Add Description**. Possible values are: `guest`, `administrator`, `viewer`, `externalGuest`.|
|useBusinessHours|Boolean|**TODO: Add Description**|
|workingHours|[bookingWorkHours](../resources/bookingworkhours.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [bookingStaffMember](../resources/bookingstaffmember.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_bookingstaffmember"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/bookingBusinesses/{bookingBusinessesId}/staffMembers/{bookingStaffMemberId}
Content-Type: application/json
Content-length: 356

{
  "@odata.type": "#microsoft.graph.bookingStaffMember",
  "displayName": "String",
  "emailAddress": "String",
  "availabilityIsAffectedByPersonalCalendar": "Boolean",
  "colorIndex": "Integer",
  "role": "String",
  "useBusinessHours": "Boolean",
  "workingHours": [
    {
      "@odata.type": "microsoft.graph.bookingWorkHours"
    }
  ]
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
  "@odata.type": "#microsoft.graph.bookingStaffMember",
  "id": "55c9b6e2-b6e2-55c9-e2b6-c955e2b6c955",
  "displayName": "String",
  "emailAddress": "String",
  "availabilityIsAffectedByPersonalCalendar": "Boolean",
  "colorIndex": "Integer",
  "role": "String",
  "useBusinessHours": "Boolean",
  "workingHours": [
    {
      "@odata.type": "microsoft.graph.bookingWorkHours"
    }
  ]
}
```

