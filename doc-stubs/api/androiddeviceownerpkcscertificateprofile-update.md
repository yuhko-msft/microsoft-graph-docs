---
title: "Update androidDeviceOwnerPkcsCertificateProfile"
description: "Update the properties of an androidDeviceOwnerPkcsCertificateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update androidDeviceOwnerPkcsCertificateProfile
Namespace: microsoft.graph

Update the properties of an [androidDeviceOwnerPkcsCertificateProfile](../resources/androiddeviceownerpkcscertificateprofile.md) object.

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
PATCH ** Entity URI for microsoft.graph.androidDeviceOwnerPkcsCertificateProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [androidDeviceOwnerPkcsCertificateProfile](../resources/androiddeviceownerpkcscertificateprofile.md) object.

The following table shows the properties that are required when you create the [androidDeviceOwnerPkcsCertificateProfile](../resources/androiddeviceownerpkcscertificateprofile.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|roleScopeTagIds|String collection|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|supportsScopeTags|Boolean|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/intune-devicemanagementapplicabilityruleosedition.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/intune-devicemanagementapplicabilityruleosversion.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/intune-devicemanagementapplicabilityruledevicemode.md)|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|createdDateTime|DateTimeOffset|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|description|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|displayName|String|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|version|Int32|**TODO: Add Description** Inherited from [deviceConfiguration](../resources/intune-deviceconfiguration.md)|
|renewalThresholdPercentage|Int32|**TODO: Add Description** Inherited from [androidDeviceOwnerCertificateProfileBase](../resources/androiddeviceownercertificateprofilebase.md)|
|subjectNameFormat|subjectNameFormat|**TODO: Add Description** Inherited from [androidDeviceOwnerCertificateProfileBase](../resources/androiddeviceownercertificateprofilebase.md). Possible values are: `commonName`, `commonNameIncludingEmail`, `commonNameAsEmail`, `custom`, `commonNameAsIMEI`, `commonNameAsSerialNumber`, `commonNameAsAadDeviceId`, `commonNameAsIntuneDeviceId`, `commonNameAsDurableDeviceId`.|
|certificateValidityPeriodValue|Int32|**TODO: Add Description** Inherited from [androidDeviceOwnerCertificateProfileBase](../resources/androiddeviceownercertificateprofilebase.md)|
|certificateValidityPeriodScale|certificateValidityPeriodScale|**TODO: Add Description** Inherited from [androidDeviceOwnerCertificateProfileBase](../resources/androiddeviceownercertificateprofilebase.md). Possible values are: `days`, `months`, `years`.|
|extendedKeyUsages|[extendedKeyUsage](../resources/intune-extendedkeyusage.md) collection|**TODO: Add Description** Inherited from [androidDeviceOwnerCertificateProfileBase](../resources/androiddeviceownercertificateprofilebase.md)|
|subjectAlternativeNameType|subjectAlternativeNameType|**TODO: Add Description** Inherited from [androidDeviceOwnerCertificateProfileBase](../resources/androiddeviceownercertificateprofilebase.md). Possible values are: `none`, `emailAddress`, `userPrincipalName`, `customAzureADAttribute`, `domainNameService`, `universalResourceIdentifier`.|
|certificationAuthority|String|**TODO: Add Description**|
|certificationAuthorityName|String|**TODO: Add Description**|
|certificationAuthorityType|deviceManagementCertificationAuthority|**TODO: Add Description**. Possible values are: `notConfigured`, `microsoft`, `digiCert`.|
|certificateTemplateName|String|**TODO: Add Description**|
|subjectAlternativeNameFormatString|String|**TODO: Add Description**|
|subjectNameFormatString|String|**TODO: Add Description**|
|certificateStore|certificateStore|**TODO: Add Description**. Possible values are: `user`, `machine`.|
|customSubjectAlternativeNames|[customSubjectAlternativeName](../resources/intune-customsubjectalternativename.md) collection|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [androidDeviceOwnerPkcsCertificateProfile](../resources/androiddeviceownerpkcscertificateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_androiddeviceownerpkcscertificateprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/beta** Entity URI for microsoft.graph.androidDeviceOwnerPkcsCertificateProfile not found
Content-Type: application/json
Content-length: 1393

{
  "@odata.type": "#microsoft.graph.androidDeviceOwnerPkcsCertificateProfile",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "renewalThresholdPercentage": "Integer",
  "subjectNameFormat": "String",
  "certificateValidityPeriodValue": "Integer",
  "certificateValidityPeriodScale": "String",
  "extendedKeyUsages": [
    {
      "@odata.type": "microsoft.graph.extendedKeyUsage"
    }
  ],
  "subjectAlternativeNameType": "String",
  "certificationAuthority": "String",
  "certificationAuthorityName": "String",
  "certificationAuthorityType": "String",
  "certificateTemplateName": "String",
  "subjectAlternativeNameFormatString": "String",
  "subjectNameFormatString": "String",
  "certificateStore": "String",
  "customSubjectAlternativeNames": [
    {
      "@odata.type": "microsoft.graph.customSubjectAlternativeName"
    }
  ]
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
  "@odata.type": "#microsoft.graph.androidDeviceOwnerPkcsCertificateProfile",
  "id": "86ba8b67-8b67-86ba-678b-ba86678bba86",
  "lastModifiedDateTime": "String (timestamp)",
  "roleScopeTagIds": [
    "String"
  ],
  "supportsScopeTags": "Boolean",
  "deviceManagementApplicabilityRuleOsEdition": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsEdition"
  },
  "deviceManagementApplicabilityRuleOsVersion": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleOsVersion"
  },
  "deviceManagementApplicabilityRuleDeviceMode": {
    "@odata.type": "microsoft.graph.deviceManagementApplicabilityRuleDeviceMode"
  },
  "createdDateTime": "String (timestamp)",
  "description": "String",
  "displayName": "String",
  "version": "Integer",
  "renewalThresholdPercentage": "Integer",
  "subjectNameFormat": "String",
  "certificateValidityPeriodValue": "Integer",
  "certificateValidityPeriodScale": "String",
  "extendedKeyUsages": [
    {
      "@odata.type": "microsoft.graph.extendedKeyUsage"
    }
  ],
  "subjectAlternativeNameType": "String",
  "certificationAuthority": "String",
  "certificationAuthorityName": "String",
  "certificationAuthorityType": "String",
  "certificateTemplateName": "String",
  "subjectAlternativeNameFormatString": "String",
  "subjectNameFormatString": "String",
  "certificateStore": "String",
  "customSubjectAlternativeNames": [
    {
      "@odata.type": "microsoft.graph.customSubjectAlternativeName"
    }
  ]
}
```

