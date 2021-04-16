---
title: "Update macOSPkcsCertificateProfile"
description: "Update the properties of a macOSPkcsCertificateProfile object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update macOSPkcsCertificateProfile
Namespace: microsoft.graph



Update the properties of a [macOSPkcsCertificateProfile](../resources/macospkcscertificateprofile.md) object.

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
PATCH ** Entity URI for microsoft.graph.macOSPkcsCertificateProfile not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [macOSPkcsCertificateProfile](../resources/macospkcscertificateprofile.md) object.

The following table shows the properties that are required when you update the [macOSPkcsCertificateProfile](../resources/macospkcscertificateprofile.md).

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
|allowAllAppsAccess|Boolean|AllowAllAppsAccess setting|
|certificateStore|certificateStore|Target store certificate. Possible values are: `user`, `machine`.|
|certificateTemplateName|String|PKCS certificate template name.|
|certificationAuthority|String|PKCS certification authority FQDN.|
|certificationAuthorityName|String|PKCS certification authority Name.|
|customSubjectAlternativeNames|[customSubjectAlternativeName](../resources/customsubjectalternativename.md) collection|Custom Subject Alternative Name Settings. This collection can contain a maximum of 500 elements.|
|subjectAlternativeNameFormatString|String|Format string that defines the subject alternative name.|
|subjectNameFormatString|String|Format string that defines the subject name. Example: CN={{EmailAddress}},E={{EmailAddress}},OU=Enterprise Users,O=Contoso Corporation,L=Redmond,ST=WA,C=US|



## Response

If successful, this method returns a `200 OK` response code and an updated [macOSPkcsCertificateProfile](../resources/macospkcscertificateprofile.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_macospkcscertificateprofile"
}
-->
``` http
PATCH https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSPkcsCertificateProfile not found
Content-Type: application/json
Content-length: 1270

{
  "@odata.type": "#microsoft.graph.macOSPkcsCertificateProfile",
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
  "allowAllAppsAccess": "Boolean",
  "certificateStore": "String",
  "certificateTemplateName": "String",
  "certificationAuthority": "String",
  "certificationAuthorityName": "String",
  "customSubjectAlternativeNames": [
    {
      "@odata.type": "microsoft.graph.customSubjectAlternativeName"
    }
  ],
  "subjectAlternativeNameFormatString": "String",
  "subjectNameFormatString": "String"
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
  "@odata.type": "#microsoft.graph.macOSPkcsCertificateProfile",
  "id": "3179b838-b838-3179-38b8-793138b87931",
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
  "allowAllAppsAccess": "Boolean",
  "certificateStore": "String",
  "certificateTemplateName": "String",
  "certificationAuthority": "String",
  "certificationAuthorityName": "String",
  "customSubjectAlternativeNames": [
    {
      "@odata.type": "microsoft.graph.customSubjectAlternativeName"
    }
  ],
  "subjectAlternativeNameFormatString": "String",
  "subjectNameFormatString": "String"
}
```

