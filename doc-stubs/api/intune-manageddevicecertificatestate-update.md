---
title: "Update managedDeviceCertificateState"
description: "Update the properties of a managedDeviceCertificateState object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Update managedDeviceCertificateState
Namespace: microsoft.graph

Update the properties of a [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object.

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
PATCH /managedDeviceCertificateState
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object.

The following table shows the properties that are required when you create the [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|devicePlatform|devicePlatformType|**TODO: Add Description**. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|certificateKeyUsage|keyUsages|**TODO: Add Description**. Possible values are: `keyEncipherment`, `digitalSignature`.|
|certificateValidityPeriodUnits|certificateValidityPeriodScale|**TODO: Add Description**. Possible values are: `days`, `months`, `years`.|
|certificateIssuanceState|certificateIssuanceStates|**TODO: Add Description**. Possible values are: `unknown`, `challengeIssued`, `challengeIssueFailed`, `requestCreationFailed`, `requestSubmitFailed`, `challengeValidationSucceeded`, `challengeValidationFailed`, `issueFailed`, `issuePending`, `issued`, `responseProcessingFailed`, `responsePending`, `enrollmentSucceeded`, `enrollmentNotNeeded`, `revoked`, `removedFromCollection`, `renewVerified`, `installFailed`, `installed`, `deleteFailed`, `deleted`, `renewalRequested`, `requested`.|
|certificateKeyStorageProvider|keyStorageProviderOption|**TODO: Add Description**. Possible values are: `useTpmKspOtherwiseUseSoftwareKsp`, `useTpmKspOtherwiseFail`, `usePassportForWorkKspOtherwiseFail`, `useSoftwareKsp`.|
|certificateSubjectNameFormat|subjectNameFormat|**TODO: Add Description**. Possible values are: `commonName`, `commonNameIncludingEmail`, `commonNameAsEmail`, `custom`, `commonNameAsIMEI`, `commonNameAsSerialNumber`, `commonNameAsAadDeviceId`, `commonNameAsIntuneDeviceId`, `commonNameAsDurableDeviceId`.|
|certificateSubjectAlternativeNameFormat|subjectAlternativeNameType|**TODO: Add Description**. Possible values are: `none`, `emailAddress`, `userPrincipalName`, `customAzureADAttribute`, `domainNameService`, `universalResourceIdentifier`.|
|certificateRevokeStatus|certificateRevocationStatus|**TODO: Add Description**. Possible values are: `none`, `pending`, `issued`, `failed`, `revoked`.|
|certificateProfileDisplayName|String|**TODO: Add Description**|
|deviceDisplayName|String|**TODO: Add Description**|
|userDisplayName|String|**TODO: Add Description**|
|certificateExpirationDateTime|DateTimeOffset|**TODO: Add Description**|
|certificateLastIssuanceStateChangedDateTime|DateTimeOffset|**TODO: Add Description**|
|lastCertificateStateChangeDateTime|DateTimeOffset|**TODO: Add Description**|
|certificateIssuer|String|**TODO: Add Description**|
|certificateThumbprint|String|**TODO: Add Description**|
|certificateSerialNumber|String|**TODO: Add Description**|
|certificateKeyLength|Int32|**TODO: Add Description**|
|certificateEnhancedKeyUsage|String|**TODO: Add Description**|
|certificateValidityPeriod|Int32|**TODO: Add Description**|
|certificateSubjectNameFormatString|String|**TODO: Add Description**|
|certificateSubjectAlternativeNameFormatString|String|**TODO: Add Description**|
|certificateIssuanceDateTime|DateTimeOffset|**TODO: Add Description**|
|certificateErrorCode|Int32|**TODO: Add Description**|



## Response

If successful, this method returns a `200 OK` response code and an updated [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "update_manageddevicecertificatestate"
}
-->
``` http
PATCH https://graph.microsoft.com/beta/managedDeviceCertificateState
Content-Type: application/json
Content-length: 1162

{
  "@odata.type": "#microsoft.graph.managedDeviceCertificateState",
  "devicePlatform": "String",
  "certificateKeyUsage": "String",
  "certificateValidityPeriodUnits": "String",
  "certificateIssuanceState": "String",
  "certificateKeyStorageProvider": "String",
  "certificateSubjectNameFormat": "String",
  "certificateSubjectAlternativeNameFormat": "String",
  "certificateRevokeStatus": "String",
  "certificateProfileDisplayName": "String",
  "deviceDisplayName": "String",
  "userDisplayName": "String",
  "certificateExpirationDateTime": "String (timestamp)",
  "certificateLastIssuanceStateChangedDateTime": "String (timestamp)",
  "lastCertificateStateChangeDateTime": "String (timestamp)",
  "certificateIssuer": "String",
  "certificateThumbprint": "String",
  "certificateSerialNumber": "String",
  "certificateKeyLength": "Integer",
  "certificateEnhancedKeyUsage": "String",
  "certificateValidityPeriod": "Integer",
  "certificateSubjectNameFormatString": "String",
  "certificateSubjectAlternativeNameFormatString": "String",
  "certificateIssuanceDateTime": "String (timestamp)",
  "certificateErrorCode": "Integer"
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
  "@odata.type": "#microsoft.graph.managedDeviceCertificateState",
  "id": "f9ac4030-4030-f9ac-3040-acf93040acf9",
  "devicePlatform": "String",
  "certificateKeyUsage": "String",
  "certificateValidityPeriodUnits": "String",
  "certificateIssuanceState": "String",
  "certificateKeyStorageProvider": "String",
  "certificateSubjectNameFormat": "String",
  "certificateSubjectAlternativeNameFormat": "String",
  "certificateRevokeStatus": "String",
  "certificateProfileDisplayName": "String",
  "deviceDisplayName": "String",
  "userDisplayName": "String",
  "certificateExpirationDateTime": "String (timestamp)",
  "certificateLastIssuanceStateChangedDateTime": "String (timestamp)",
  "lastCertificateStateChangeDateTime": "String (timestamp)",
  "certificateIssuer": "String",
  "certificateThumbprint": "String",
  "certificateSerialNumber": "String",
  "certificateKeyLength": "Integer",
  "certificateEnhancedKeyUsage": "String",
  "certificateValidityPeriod": "Integer",
  "certificateSubjectNameFormatString": "String",
  "certificateSubjectAlternativeNameFormatString": "String",
  "certificateIssuanceDateTime": "String (timestamp)",
  "certificateErrorCode": "Integer"
}
```

