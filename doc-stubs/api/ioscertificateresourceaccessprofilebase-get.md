---
title: "Get iosCertificateResourceAccessProfileBase"
description: "Read the properties and relationships of an iosCertificateResourceAccessProfileBase object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get iosCertificateResourceAccessProfileBase
Namespace: microsoft.graph

Read the properties and relationships of an [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md) object.

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
GET ** Entity URI for microsoft.graph.iosCertificateResourceAccessProfileBase not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and an [iosCertificateResourceAccessProfileBase](../resources/ioscertificateresourceaccessprofilebase.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_ioscertificateresourceaccessprofilebase"
}
-->
``` http
GET https://graph.microsoft.com/beta** Entity URI for microsoft.graph.iosCertificateResourceAccessProfileBase not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.iosCertificateResourceAccessProfileBase"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.iosCertificateResourceAccessProfileBase",
    "id": "7dd6ef59-ef59-7dd6-59ef-d67d59efd67d",
    "version": "Integer",
    "displayName": "String",
    "description": "String",
    "creationDateTime": "String (timestamp)",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "renewalThresholdPercentage": "Integer"
  }
}
```

