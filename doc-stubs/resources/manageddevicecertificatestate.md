---
title: "managedDeviceCertificateState resource type"
description: "**TODO: Add Description**"
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# managedDeviceCertificateState resource type

Namespace: microsoft.graph



**TODO: Add Description**


Inherits from [entity](../resources/entity.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List managedDeviceCertificateStates](../api/manageddevicecertificatestate-list.md)|[managedDeviceCertificateState](../resources/manageddevicecertificatestate.md) collection|Get a list of the [managedDeviceCertificateState](../resources/manageddevicecertificatestate.md) objects and their properties.|
|[Create managedDeviceCertificateState](../api/manageddevicecertificatestate-create.md)|[managedDeviceCertificateState](../resources/manageddevicecertificatestate.md)|Create a new [managedDeviceCertificateState](../resources/manageddevicecertificatestate.md) object.|
|[Get managedDeviceCertificateState](../api/manageddevicecertificatestate-get.md)|[managedDeviceCertificateState](../resources/manageddevicecertificatestate.md)|Read the properties and relationships of a [managedDeviceCertificateState](../resources/manageddevicecertificatestate.md) object.|
|[Update managedDeviceCertificateState](../api/manageddevicecertificatestate-update.md)|[managedDeviceCertificateState](../resources/manageddevicecertificatestate.md)|Update the properties of a [managedDeviceCertificateState](../resources/manageddevicecertificatestate.md) object.|
|[Delete managedDeviceCertificateState](../api/manageddevicecertificatestate-delete.md)|None|Deletes a [managedDeviceCertificateState](../resources/manageddevicecertificatestate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certificateEnhancedKeyUsage|String|Extended key usage|
|certificateErrorCode|Int32|Error code|
|certificateExpirationDateTime|DateTimeOffset|Certificate expiry date|
|certificateIssuanceDateTime|DateTimeOffset|Issuance date|
|certificateIssuanceState|certificateIssuanceStates|Issuance State. Possible values are: `unknown`, `challengeIssued`, `challengeIssueFailed`, `requestCreationFailed`, `requestSubmitFailed`, `challengeValidationSucceeded`, `challengeValidationFailed`, `issueFailed`, `issuePending`, `issued`, `responseProcessingFailed`, `responsePending`, `enrollmentSucceeded`, `enrollmentNotNeeded`, `revoked`, `removedFromCollection`, `renewVerified`, `installFailed`, `installed`, `deleteFailed`, `deleted`, `renewalRequested`, `requested`.|
|certificateIssuer|String|Issuer|
|certificateKeyLength|Int32|Key length|
|certificateKeyStorageProvider|keyStorageProviderOption|Key Storage Provider. Possible values are: `useTpmKspOtherwiseUseSoftwareKsp`, `useTpmKspOtherwiseFail`, `usePassportForWorkKspOtherwiseFail`, `useSoftwareKsp`.|
|certificateKeyUsage|keyUsages|Key usage. Possible values are: `keyEncipherment`, `digitalSignature`.|
|certificateLastIssuanceStateChangedDateTime|DateTimeOffset|Last certificate issuance state change|
|certificateProfileDisplayName|String|Certificate profile display name|
|certificateRevokeStatus|certificateRevocationStatus|Revoke status. Possible values are: `none`, `pending`, `issued`, `failed`, `revoked`.|
|certificateSerialNumber|String|Serial number|
|certificateSubjectAlternativeNameFormat|subjectAlternativeNameType|Subject alternative name format. Possible values are: `none`, `emailAddress`, `userPrincipalName`, `customAzureADAttribute`, `domainNameService`, `universalResourceIdentifier`.|
|certificateSubjectAlternativeNameFormatString|String|Subject alternative name format string for custom formats|
|certificateSubjectNameFormat|subjectNameFormat|Subject name format. Possible values are: `commonName`, `commonNameIncludingEmail`, `commonNameAsEmail`, `custom`, `commonNameAsIMEI`, `commonNameAsSerialNumber`, `commonNameAsAadDeviceId`, `commonNameAsIntuneDeviceId`, `commonNameAsDurableDeviceId`.|
|certificateSubjectNameFormatString|String|Subject name format string for custom subject name formats|
|certificateThumbprint|String|Thumbprint|
|certificateValidityPeriod|Int32|Validity period|
|certificateValidityPeriodUnits|certificateValidityPeriodScale|Validity period units. Possible values are: `days`, `months`, `years`.|
|deviceDisplayName|String|Device display name|
|devicePlatform|devicePlatformType|Device platform. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastCertificateStateChangeDateTime|DateTimeOffset|Last certificate issuance state change|
|userDisplayName|String|User display name|

## Relationships
None.

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.managedDeviceCertificateState",
  "baseType": "microsoft.graph.entity",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.managedDeviceCertificateState",
  "id": "String (identifier)",
  "certificateEnhancedKeyUsage": "String",
  "certificateErrorCode": "Integer",
  "certificateExpirationDateTime": "String (timestamp)",
  "certificateIssuanceDateTime": "String (timestamp)",
  "certificateIssuanceState": "String",
  "certificateIssuer": "String",
  "certificateKeyLength": "Integer",
  "certificateKeyStorageProvider": "String",
  "certificateKeyUsage": "String",
  "certificateLastIssuanceStateChangedDateTime": "String (timestamp)",
  "certificateProfileDisplayName": "String",
  "certificateRevokeStatus": "String",
  "certificateSerialNumber": "String",
  "certificateSubjectAlternativeNameFormat": "String",
  "certificateSubjectAlternativeNameFormatString": "String",
  "certificateSubjectNameFormat": "String",
  "certificateSubjectNameFormatString": "String",
  "certificateThumbprint": "String",
  "certificateValidityPeriod": "Integer",
  "certificateValidityPeriodUnits": "String",
  "deviceDisplayName": "String",
  "devicePlatform": "String",
  "lastCertificateStateChangeDateTime": "String (timestamp)",
  "userDisplayName": "String"
}
```

