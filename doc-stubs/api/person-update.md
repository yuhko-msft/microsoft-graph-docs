---
title: "Update person"
description: "Update the properties of a person object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update person
Namespace: microsoft.graph



Update the properties of a [person](../resources/person.md) object.

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
PATCH /me/people/{personId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [person](../resources/person.md) object.

The following table shows the properties that are required when you update the [person](../resources/person.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|birthday|String|**TODO: Add Description**|
|companyName|String|**TODO: Add Description**|
|department|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|emailAddresses|[rankedEmailAddress](../resources/rankedemailaddress.md) collection|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|isFavorite|Boolean|**TODO: Add Description**|
|mailboxType|String|**TODO: Add Description**|
|officeLocation|String|**TODO: Add Description**|
|personNotes|String|**TODO: Add Description**|
|personType|String|**TODO: Add Description**|
|phones|[phone](../resources/phone.md) collection|**TODO: Add Description**|
|postalAddresses|[location](../resources/location.md) collection|**TODO: Add Description**|
|profession|String|**TODO: Add Description**|
|sources|[personDataSource](../resources/persondatasource.md) collection|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|
|title|String|**TODO: Add Description**|
|userPrincipalName|String|**TODO: Add Description**|
|websites|[website](../resources/website.md) collection|**TODO: Add Description**|
|yomiCompany|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [person](../resources/person.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_person"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/people/{personId}
Content-Type: application/json
Content-length: 913

{
  "@odata.type": "#microsoft.graph.person",
  "birthday": "String",
  "companyName": "String",
  "department": "String",
  "displayName": "String",
  "emailAddresses": [
    {
      "@odata.type": "microsoft.graph.rankedEmailAddress"
    }
  ],
  "givenName": "String",
  "isFavorite": "Boolean",
  "mailboxType": "String",
  "officeLocation": "String",
  "personNotes": "String",
  "personType": "String",
  "phones": [
    {
      "@odata.type": "microsoft.graph.phone"
    }
  ],
  "postalAddresses": [
    {
      "@odata.type": "microsoft.graph.location"
    }
  ],
  "profession": "String",
  "sources": [
    {
      "@odata.type": "microsoft.graph.personDataSource"
    }
  ],
  "surname": "String",
  "title": "String",
  "userPrincipalName": "String",
  "websites": [
    {
      "@odata.type": "microsoft.graph.website"
    }
  ],
  "yomiCompany": "String"
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
  "@odata.type": "#microsoft.graph.person",
  "id": "82c25986-5986-82c2-8659-c2828659c282",
  "birthday": "String",
  "companyName": "String",
  "department": "String",
  "displayName": "String",
  "emailAddresses": [
    {
      "@odata.type": "microsoft.graph.rankedEmailAddress"
    }
  ],
  "givenName": "String",
  "isFavorite": "Boolean",
  "mailboxType": "String",
  "officeLocation": "String",
  "personNotes": "String",
  "personType": "String",
  "phones": [
    {
      "@odata.type": "microsoft.graph.phone"
    }
  ],
  "postalAddresses": [
    {
      "@odata.type": "microsoft.graph.location"
    }
  ],
  "profession": "String",
  "sources": [
    {
      "@odata.type": "microsoft.graph.personDataSource"
    }
  ],
  "surname": "String",
  "title": "String",
  "userPrincipalName": "String",
  "websites": [
    {
      "@odata.type": "microsoft.graph.website"
    }
  ],
  "yomiCompany": "String"
}
```

