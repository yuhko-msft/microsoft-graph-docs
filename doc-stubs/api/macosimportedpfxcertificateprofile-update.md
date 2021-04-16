---
title: "Update macOSImportedPFXCertificateProfile"
description: "Update the properties of a macOSImportedPFXCertificateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSImportedPFXCertificateProfile
Namespace: microsoft.graph



Update the properties of a [macOSImportedPFXCertificateProfile](../resources/macosimportedpfxcertificateprofile.md) object.

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
PATCH ** Entity URI for microsoft.graph.macOSImportedPFXCertificateProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSImportedPFXCertificateProfile](../resources/macosimportedpfxcertificateprofile.md) object.

The following table shows the properties that are required when you update the [macOSImportedPFXCertificateProfile](../resources/macosimportedpfxcertificateprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|certificateValidityPeriodScale|certificateValidityPeriodScale|Scale for the Certificate Validity Period. Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md). Possible values are: `days`, `months`, `years`.|
|certificateValidityPeriodValue|Int32|Value for the Certificate Validity Period. Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md)|
|renewalThresholdPercentage|Int32|Certificate renewal threshold percentage. Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md)|
|subjectAlternativeNameType|subjectAlternativeNameType|Certificate Subject Alternative Name Type. Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md). Possible values are: `none`, `emailAddress`, `userPrincipalName`, `customAzureADAttribute`, `domainNameService`, `universalResourceIdentifier`.|
|subjectNameFormat|appleSubjectNameFormat|Certificate Subject Name Format. Inherited from [macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md). Possible values are: `commonName`, `commonNameAsEmail`, `custom`, `commonNameIncludingEmail`, `commonNameAsIMEI`, `commonNameAsSerialNumber`.|
|intendedPurpose|intendedPurpose|Intended Purpose of the Certificate Profile - which could be Unassigned, SmimeEncryption, SmimeSigning etc. Possible values are: `unassigned`, `smimeEncryption`, `smimeSigning`, `vpn`, `wifi`.|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSImportedPFXCertificateProfile](../resources/macosimportedpfxcertificateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macosimportedpfxcertificateprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSImportedPFXCertificateProfile not found
Content-Type: application/json
Content-length: 900

{
  "@odata.type": "#microsoft.graph.macOSImportedPFXCertificateProfile",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "certificateValidityPeriodScale": "String",
  "certificateValidityPeriodValue": "Integer",
  "renewalThresholdPercentage": "Integer",
  "subjectAlternativeNameType": "String",
  "subjectNameFormat": "String",
  "intendedPurpose": "String"
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
  "@odata.type": "#microsoft.graph.macOSImportedPFXCertificateProfile",
  "id": "4a938ed6-8ed6-4a93-d68e-934ad68e934a",
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "displayName": "String",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "version": "Integer",
  "certificateValidityPeriodScale": "String",
  "certificateValidityPeriodValue": "Integer",
  "renewalThresholdPercentage": "Integer",
  "subjectAlternativeNameType": "String",
  "subjectNameFormat": "String",
  "intendedPurpose": "String"
}
```

