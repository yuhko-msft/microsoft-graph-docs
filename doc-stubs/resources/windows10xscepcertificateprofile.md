---
title: "windows10XSCEPCertificateProfile resource type"
description: "Windows X SCEP Certificate configuration profile"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# windows10XSCEPCertificateProfile resource type

Namespace: microsoft.graph



Windows X SCEP Certificate configuration profile


Inherits from [windows10XCertificateProfile](../resources/windows10xcertificateprofile.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List windows10XSCEPCertificateProfile](../api/windows10xscepcertificateprofile-list.md)|[windows10XSCEPCertificateProfile](../resources/windows10xscepcertificateprofile.md) collection|Get a list of the [windows10XSCEPCertificateProfile](../resources/windows10xscepcertificateprofile.md) objects and their properties.|
|[Create windows10XSCEPCertificateProfile](../api/windows10xscepcertificateprofile-create.md)|[windows10XSCEPCertificateProfile](../resources/windows10xscepcertificateprofile.md)|Create a new [windows10XSCEPCertificateProfile](../resources/windows10xscepcertificateprofile.md) object.|
|[Get windows10XSCEPCertificateProfile](../api/windows10xscepcertificateprofile-get.md)|[windows10XSCEPCertificateProfile](../resources/windows10xscepcertificateprofile.md)|Read the properties and relationships of a [windows10XSCEPCertificateProfile](../resources/windows10xscepcertificateprofile.md) object.|
|[Update windows10XSCEPCertificateProfile](../api/windows10xscepcertificateprofile-update.md)|[windows10XSCEPCertificateProfile](../resources/windows10xscepcertificateprofile.md)|Update the properties of a [windows10XSCEPCertificateProfile](../resources/windows10xscepcertificateprofile.md) object.|
|[Delete windows10XSCEPCertificateProfile](../api/windows10xscepcertificateprofile-delete.md)|None|Deletes a [windows10XSCEPCertificateProfile](../resources/windows10xscepcertificateprofile.md) object.|
|[List assignments](../api/windows10xscepcertificateprofile-list-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|Get the deviceManagementResourceAccessProfileAssignment resources from the assignments navigation property.|
|[Create deviceManagementResourceAccessProfileAssignment](../api/windows10xscepcertificateprofile-post-assignments.md)|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md)|Create a new deviceManagementResourceAccessProfileAssignment object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certificateStore|certificateStore|Target store certificate. Possible values are: `user`, `machine`.|
|certificateValidityPeriodScale|certificateValidityPeriodScale|Scale for the Certificate Validity Period. Possible values are: `days`, `months`, `years`.|
|certificateValidityPeriodValue|Int32|Value for the Certificate Validity Period|
|creationDateTime|DateTimeOffset|DateTime profile was created Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|description|String|Profile description Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|displayName|String|Profile display name Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|extendedKeyUsages|[extendedKeyUsage](../resources/extendedkeyusage.md) collection|Extended Key Usage (EKU) settings.|
|hashAlgorithm|hashAlgorithms collection|SCEP Hash Algorithm.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|keySize|keySize|SCEP Key Size. Possible values are: `size1024`, `size2048`, `size4096`.|
|keyStorageProvider|keyStorageProviderOption|Key Storage Provider (KSP). Possible values are: `useTpmKspOtherwiseUseSoftwareKsp`, `useTpmKspOtherwiseFail`, `usePassportForWorkKspOtherwiseFail`, `useSoftwareKsp`.|
|keyUsage|keyUsages|SCEP Key Usage. Possible values are: `keyEncipherment`, `digitalSignature`.|
|lastModifiedDateTime|DateTimeOffset|DateTime profile was last modified Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|renewalThresholdPercentage|Int32|Certificate renewal threshold percentage|
|roleScopeTagIds|String collection|Scope Tags Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|
|rootCertificateId|Guid|Trusted Root Certificate ID|
|scepServerUrls|String collection|SCEP Server Url(s).|
|subjectAlternativeNameFormats|[windows10XCustomSubjectAlternativeName](../resources/windows10xcustomsubjectalternativename.md) collection|Custom AAD Attributes.|
|subjectNameFormatString|String|Custom format to use with SubjectNameFormat = Custom. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US|
|version|Int32|Version of the profile Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceManagementResourceAccessProfileAssignment](../resources/devicemanagementresourceaccessprofileassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceManagementResourceAccessProfileBase](../resources/devicemanagementresourceaccessprofilebase.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.windows10XSCEPCertificateProfile",
  "baseType": "microsoft.graph.windows10XCertificateProfile",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.windows10XSCEPCertificateProfile",
  "id": "String (identifier)",
  "creationDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "version": "Integer",
  "certificateStore": "String",
  "certificateValidityPeriodScale": "String",
  "certificateValidityPeriodValue": "Integer",
  "extendedKeyUsages": [
    {
      "@odata.type": "microsoft.graph.extendedKeyUsage"
    }
  ],
  "hashAlgorithm": [
    "String"
  ],
  "keySize": "String",
  "keyStorageProvider": "String",
  "keyUsage": "String",
  "renewalThresholdPercentage": "Integer",
  "rootCertificateId": "Guid",
  "scepServerUrls": [
    "String"
  ],
  "subjectAlternativeNameFormats": [
    {
      "@odata.type": "microsoft.graph.windows10XCustomSubjectAlternativeName"
    }
  ],
  "subjectNameFormatString": "String"
}
```

