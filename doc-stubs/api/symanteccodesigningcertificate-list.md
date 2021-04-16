---
title: "List symantecCodeSigningCertificates"
description: "Get a list of the symantecCodeSigningCertificate objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List symantecCodeSigningCertificates
Namespace: microsoft.graph



Get a list of the [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.symantecCodeSigningCertificate not found
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

If successful, this method returns a `200 OK` response code and a collection of [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_symanteccodesigningcertificate"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.symantecCodeSigningCertificate not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.symantecCodeSigningCertificate)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.symantecCodeSigningCertificate",
      "id": "e6771b7d-1b7d-e677-7d1b-77e67d1b77e6",
      "content": "Binary",
      "expirationDateTime": "String (timestamp)",
      "issuer": "String",
      "issuerName": "String",
      "password": "String",
      "status": "String",
      "subject": "String",
      "subjectName": "String",
      "uploadDateTime": "String (timestamp)"
    }
  ]
}
```

