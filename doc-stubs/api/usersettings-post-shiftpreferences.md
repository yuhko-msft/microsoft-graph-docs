---
title: "Create shiftPreferences"
description: "Create a new shiftPreferences object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
ms.localizationpriority: medium
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create shiftPreferences
Namespace: microsoft.graph

[!INCLUDE [beta-disclaimer](../../includes/beta-disclaimer.md)]

Create a new shiftPreferences object.

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
POST /userSettings/shiftPreferences
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [shiftPreferences](../resources/shiftpreferences.md) object.

The following table shows the properties that are required when you create the [shiftPreferences](../resources/shiftpreferences.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdBy|[Microsoft.Teams.Shifts.identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|lastModifiedBy|[Microsoft.Teams.Shifts.identitySet](../resources/identityset.md)|**TODO: Add Description** Inherited from [changeTrackedEntity](../resources/changetrackedentity.md)|
|availability|[Microsoft.Teams.Shifts.shiftAvailability](../resources/shiftavailability.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `201 Created` response code and a [shiftPreferences](../resources/shiftpreferences.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_shiftpreferences_from_"
}
-->
``` http
POST https://graph.microsoft.com/beta/userSettings/shiftPreferences
Content-Type: application/json
Content-length: 238

{
  "@odata.type": "#Microsoft.Teams.Shifts.shiftPreferences",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "availability": [
    {
      "@odata.type": "microsoft.graph.shiftAvailability"
    }
  ]
}
```


### Response
>**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Microsoft.Teams.Shifts.shiftPreferences"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#Microsoft.Teams.Shifts.shiftPreferences",
  "id": "ef7ed2dd-d2dd-ef7e-ddd2-7eefddd27eef",
  "createdBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "lastModifiedBy": {
    "@odata.type": "microsoft.graph.identitySet"
  },
  "availability": [
    {
      "@odata.type": "microsoft.graph.shiftAvailability"
    }
  ]
}
```

