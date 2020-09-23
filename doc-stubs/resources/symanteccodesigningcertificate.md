---
title: "symantecCodeSigningCertificate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# symantecCodeSigningCertificate resource type

Namespace: microsoft.graph

**TODO: Add Description**

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List symantecCodeSigningCertificates](../api/symanteccodesigningcertificate-list.md)|[symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) collection|Get a list of the [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) objects and their properties.|
|[Create symantecCodeSigningCertificate](../api/symanteccodesigningcertificate-create.md)|[symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md)|Create a new [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) object.|
|[Get symantecCodeSigningCertificate](../api/symanteccodesigningcertificate-get.md)|[symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md)|Read the properties and relationships of a [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) object.|
|[Update symantecCodeSigningCertificate](../api/symanteccodesigningcertificate-update.md)|[symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md)|Update the properties of a [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) object.|
|[Delete symantecCodeSigningCertificate](../api/symanteccodesigningcertificate-delete.md)|None|Deletes a [symantecCodeSigningCertificate](../resources/symanteccodesigningcertificate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|Binary|The Windows Symantec Code-Signing Certificate in the raw data format.|
|expirationDateTime|DateTimeOffset|The Cert Expiration Date.|
|id|String|The key of the entity.|
|issuer|String|The Issuer value for the cert.|
|issuerName|String|The Issuer Name for the cert.|
|password|String|The Password required for .pfx file.|
|status|certificateStatus|The Cert Status Provisioned or not Provisioned. Possible values are: `notProvisioned`, `provisioned`.|
|subject|String|The Subject value for the cert.|
|subjectName|String|The Subject Name for the cert.|
|uploadDateTime|DateTimeOffset|The Type of the CodeSigning Cert as Symantec Cert.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.symantecCodeSigningCertificate",
  "baseType": "",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.symantecCodeSigningCertificate",
  "id": "String (identifier)",
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
```

