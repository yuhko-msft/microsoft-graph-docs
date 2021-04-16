---
title: "Create symantecCodeSigningCertificate"
description: "Create a new symantecCodeSigningCertificate object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create symantecCodeSigningCertificate
Namespace: microsoft.graph



Create a new symantecCodeSigningCertificate object.

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
POST /deviceAppManagement/symantecCodeSigningCertificate
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) object.

The following table shows the properties that are required when you create the [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|content|Binary|The Windows Symantec Code-Signing Certificate in the raw data format.|
|expirationDateTime|DateTimeOffset|The Cert Expiration Date.|
|issuer|String|The Issuer value for the cert.|
|issuerName|String|The Issuer Name for the cert.|
|password|String|The Password required for .pfx file.|
|status|certificateStatus|The Cert Status Provisioned or not Provisioned. Possible values are: `notProvisioned`, `provisioned`.|
|subject|String|The Subject value for the cert.|
|subjectName|String|The Subject Name for the cert.|
|uploadDateTime|DateTimeOffset|The Type of the CodeSigning Cert as Symantec Cert.|



## Response

If successful, this method returns a `201 Created` response code and a [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_symanteccodesigningcertificate_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0/deviceAppManagement/symantecCodeSigningCertificate
Content-Type: application/json
Content-length: 336

{
  "@odata.type": "#microsoft.graph.symantecCodeSigningCertificate",
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
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.symantecCodeSigningCertificate"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

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
```

