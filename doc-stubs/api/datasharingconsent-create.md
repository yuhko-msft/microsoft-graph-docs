---
title: "Create dataSharingConsent"
description: "Create a new dataSharingConsent object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create dataSharingConsent
Namespace: microsoft.graph



Create a new [dataSharingConsent](../resources/datasharingconsent.md) object.

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
POST /deviceManagement/dataSharingConsents
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [dataSharingConsent](../resources/datasharingconsent.md) object.

The following table shows the properties that are required when you create the [dataSharingConsent](../resources/datasharingconsent.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|grantDateTime|DateTimeOffset|The time consent was granted for this account|
|granted|Boolean|The granted state for the data sharing consent|
|grantedByUpn|String|The Upn of the user that granted consent for this account|
|grantedByUserId|String|The UserId of the user that granted consent for this account|
|serviceDisplayName|String|The display name of the service work flow|
|termsUrl|String|The TermsUrl for the data sharing consent|



## Response

If successful, this method returns a `201 Created` response code and a [dataSharingConsent](../resources/datasharingconsent.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_datasharingconsent_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceManagement/dataSharingConsents
Content-Type: application/json
Content-length: 248

{
  "@odata.type": "#microsoft.graph.dataSharingConsent",
  "grantDateTime": "String (timestamp)",
  "granted": "Boolean",
  "grantedByUpn": "String",
  "grantedByUserId": "String",
  "serviceDisplayName": "String",
  "termsUrl": "String"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.dataSharingConsent"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.dataSharingConsent",
  "id": "379f1236-1236-379f-3612-9f3736129f37",
  "grantDateTime": "String (timestamp)",
  "granted": "Boolean",
  "grantedByUpn": "String",
  "grantedByUserId": "String",
  "serviceDisplayName": "String",
  "termsUrl": "String"
}
```

