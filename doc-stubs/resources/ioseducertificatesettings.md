---
title: "iosEduCertificateSettings resource type"
description: "Trusted Root and PFX certificates for iOS EDU."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# iosEduCertificateSettings resource type

Namespace: microsoft.graph



Trusted Root and PFX certificates for iOS EDU.

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certFileName|String|File name to display in UI.|
|certificateTemplateName|String|PKCS Certificate Template Name.|
|certificateValidityPeriodScale|certificateValidityPeriodScale|Scale for the Certificate Validity Period. Possible values are: `days`, `months`, `years`.|
|certificateValidityPeriodValue|Int32|Value for the Certificate Validity Period.|
|certificationAuthority|String|PKCS Certification Authority.|
|certificationAuthorityName|String|PKCS Certification Authority Name.|
|renewalThresholdPercentage|Int32|Certificate renewal threshold percentage. Valid values 1 to 99|
|trustedRootCertificate|Binary|Trusted Root Certificate.|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "@odata.type": "microsoft.graph.iosEduCertificateSettings"
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.iosEduCertificateSettings",
  "certFileName": "String",
  "certificateTemplateName": "String",
  "certificateValidityPeriodScale": "String",
  "certificateValidityPeriodValue": "Integer",
  "certificationAuthority": "String",
  "certificationAuthorityName": "String",
  "renewalThresholdPercentage": "Integer",
  "trustedRootCertificate": "Binary"
}
```

