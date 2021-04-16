---
title: "enterpriseCodeSigningCertificate resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# enterpriseCodeSigningCertificate resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List enterpriseCodeSigningCertificates](../api/enterprisecodesigningcertificate-list.md)|[enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md) collection|Get a list of the [enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md) objects and their properties.|
|[Create enterpriseCodeSigningCertificate](../api/enterprisecodesigningcertificate-create.md)|[enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md)|Create a new [enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md) object.|
|[Get enterpriseCodeSigningCertificate](../api/enterprisecodesigningcertificate-get.md)|[enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md)|Read the properties and relationships of an [enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md) object.|
|[Update enterpriseCodeSigningCertificate](../api/enterprisecodesigningcertificate-update.md)|[enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md)|Update the properties of an [enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md) object.|
|[Delete enterpriseCodeSigningCertificate](../api/enterprisecodesigningcertificate-delete.md)|None|Deletes an [enterpriseCodeSigningCertificate](../resources/enterprisecodesigningcertificate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|content|Binary|The Windows Enterprise Code-Signing Certificate in the raw data format.|
|expirationDateTime|DateTimeOffset|The Cert Expiration Date.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|issuer|String|The Issuer value for the cert.|
|issuerName|String|The Issuer Name for the cert.|
|status|certificateStatus|The Certificate Status Provisioned or not Provisioned. Possible values are: `notProvisioned`, `provisioned`.|
|subject|String|The Subject Value for the cert.|
|subjectName|String|The Subject Name for the cert.|
|uploadDateTime|DateTimeOffset|The date time of CodeSigning Cert when it is uploaded.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.enterpriseCodeSigningCertificate",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.enterpriseCodeSigningCertificate",
  "id": "String (identifier)",
  "content": "Binary",
  "expirationDateTime": "String (timestamp)",
  "issuer": "String",
  "issuerName": "String",
  "status": "String",
  "subject": "String",
  "subjectName": "String",
  "uploadDateTime": "String (timestamp)"
}
```

