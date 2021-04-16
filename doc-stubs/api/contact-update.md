---
title: "Update contact"
description: "Update the properties of a contact object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update contact
Namespace: microsoft.graph



Update the properties of a [contact](../resources/contact.md) object.

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
PATCH /me/contacts/{contactId}
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [contact](../resources/contact.md) object.

The following table shows the properties that are required when you update the [contact](../resources/contact.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|categories|String collection|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|changeKey|String|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [outlookItem](../resources/outlookitem.md)|
|assistantName|String|**TODO: Add Description**|
|birthday|DateTimeOffset|**TODO: Add Description**|
|children|String collection|**TODO: Add Description**|
|companyName|String|**TODO: Add Description**|
|department|String|**TODO: Add Description**|
|displayName|String|**TODO: Add Description**|
|emailAddresses|[typedEmailAddress](../resources/typedemailaddress.md) collection|**TODO: Add Description**|
|fileAs|String|**TODO: Add Description**|
|flag|[followupFlag](../resources/followupflag.md)|**TODO: Add Description**|
|gender|String|**TODO: Add Description**|
|generation|String|**TODO: Add Description**|
|givenName|String|**TODO: Add Description**|
|imAddresses|String collection|**TODO: Add Description**|
|initials|String|**TODO: Add Description**|
|isFavorite|Boolean|**TODO: Add Description**|
|jobTitle|String|**TODO: Add Description**|
|manager|String|**TODO: Add Description**|
|middleName|String|**TODO: Add Description**|
|nickName|String|**TODO: Add Description**|
|officeLocation|String|**TODO: Add Description**|
|parentFolderId|String|**TODO: Add Description**|
|personalNotes|String|**TODO: Add Description**|
|phones|[phone](../resources/phone.md) collection|**TODO: Add Description**|
|postalAddresses|[physicalAddress](../resources/physicaladdress.md) collection|**TODO: Add Description**|
|profession|String|**TODO: Add Description**|
|spouseName|String|**TODO: Add Description**|
|surname|String|**TODO: Add Description**|
|title|String|**TODO: Add Description**|
|websites|[website](../resources/website.md) collection|**TODO: Add Description**|
|weddingAnniversary|Date|**TODO: Add Description**|
|yomiCompanyName|String|**TODO: Add Description**|
|yomiGivenName|String|**TODO: Add Description**|
|yomiSurname|String|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [contact](../resources/contact.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_contact"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0/me/contacts/{contactId}
Content-Type: application/json
Content-length: 1346

{
  "@odata.type": "#microsoft.graph.contact",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "assistantName": "String",
  "birthday": "String (timestamp)",
  "children": [
    "String"
  ],
  "companyName": "String",
  "department": "String",
  "displayName": "String",
  "emailAddresses": [
    {
      "@odata.type": "microsoft.graph.typedEmailAddress"
    }
  ],
  "fileAs": "String",
  "flag": {
    "@odata.type": "microsoft.graph.followupFlag"
  },
  "gender": "String",
  "generation": "String",
  "givenName": "String",
  "imAddresses": [
    "String"
  ],
  "initials": "String",
  "isFavorite": "Boolean",
  "jobTitle": "String",
  "manager": "String",
  "middleName": "String",
  "nickName": "String",
  "officeLocation": "String",
  "parentFolderId": "String",
  "personalNotes": "String",
  "phones": [
    {
      "@odata.type": "microsoft.graph.phone"
    }
  ],
  "postalAddresses": [
    {
      "@odata.type": "microsoft.graph.physicalAddress"
    }
  ],
  "profession": "String",
  "spouseName": "String",
  "surname": "String",
  "title": "String",
  "websites": [
    {
      "@odata.type": "microsoft.graph.website"
    }
  ],
  "weddingAnniversary": "Date",
  "yomiCompanyName": "String",
  "yomiGivenName": "String",
  "yomiSurname": "String"
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
  "@odata.type": "#microsoft.graph.contact",
  "id": "e853e491-e491-e853-91e4-53e891e453e8",
  "categories": [
    "String"
  ],
  "changeKey": "String",
  "createdDateTime": "String (timestamp)",
  "lastModifiedDateTime": "String (timestamp)",
  "assistantName": "String",
  "birthday": "String (timestamp)",
  "children": [
    "String"
  ],
  "companyName": "String",
  "department": "String",
  "displayName": "String",
  "emailAddresses": [
    {
      "@odata.type": "microsoft.graph.typedEmailAddress"
    }
  ],
  "fileAs": "String",
  "flag": {
    "@odata.type": "microsoft.graph.followupFlag"
  },
  "gender": "String",
  "generation": "String",
  "givenName": "String",
  "imAddresses": [
    "String"
  ],
  "initials": "String",
  "isFavorite": "Boolean",
  "jobTitle": "String",
  "manager": "String",
  "middleName": "String",
  "nickName": "String",
  "officeLocation": "String",
  "parentFolderId": "String",
  "personalNotes": "String",
  "phones": [
    {
      "@odata.type": "microsoft.graph.phone"
    }
  ],
  "postalAddresses": [
    {
      "@odata.type": "microsoft.graph.physicalAddress"
    }
  ],
  "profession": "String",
  "spouseName": "String",
  "surname": "String",
  "title": "String",
  "websites": [
    {
      "@odata.type": "microsoft.graph.website"
    }
  ],
  "weddingAnniversary": "Date",
  "yomiCompanyName": "String",
  "yomiGivenName": "String",
  "yomiSurname": "String"
}
```

