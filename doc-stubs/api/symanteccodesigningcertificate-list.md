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
GET ** Collection URI for microsoft.management.services.api.symantecCodeSigningCertificate not found
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
  "name": "get_symanteccodesigningcertificate"
}
-->
``` http
GET https://graph.microsoft.com/beta** Collection URI for microsoft.management.services.api.symantecCodeSigningCertificate not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.management.services.api.symantecCodeSigningCertificate)"
}
-->
``` http
HTTP/1.1 200 OK

Content-Type: application/json
{
  "value": [
    {
      "@odata.type": "#microsoft.management.services.api.symantecCodeSigningCertificate",
      "id": "cee297ad-97ad-cee2-ad97-e2cead97e2ce",
      "content": "Binary",
      "status": "String",
      "password": "String",
      "subjectName": "String",
      "subject": "String",
      "issuerName": "String",
      "issuer": "String",
      "expirationDateTime": "String (timestamp)",
      "uploadDateTime": "String (timestamp)"
    }
  ]
}
```

