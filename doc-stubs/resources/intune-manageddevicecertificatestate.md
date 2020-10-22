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
|[List managedDeviceCertificateStates](../api/androiddeviceownerimportedpfxcertificateprofile-list-manageddevicecertificatestates.md)|[managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) collection|Get the managedDeviceCertificateState resources from the managedDeviceCertificateStates navigation property.|
|[Add managedDeviceCertificateStates](../api/androiddeviceownerimportedpfxcertificateprofile-post-manageddevicecertificatestates.md)|[managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md)|Add managedDeviceCertificateStates by posting to the managedDeviceCertificateStates collection.|
|[Remove managedDeviceCertificateStates](../api/androiddeviceownerimportedpfxcertificateprofile-delete-manageddevicecertificatestates.md)|None|Remove a [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object.|
|[List managedDeviceCertificateStates](../api/intune-manageddevicecertificatestate-list.md)|[managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) collection|Get a list of the [managedDeviceCertificateState](../resources/manageddevicecertificatestate.md) objects and their properties.|
|[Create managedDeviceCertificateState](../api/intune-manageddevicecertificatestate-create.md)|[managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md)|Create a new [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object.|
|[Get managedDeviceCertificateState](../api/intune-manageddevicecertificatestate-get.md)|[managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md)|Read the properties and relationships of a [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object.|
|[Update managedDeviceCertificateState](../api/intune-manageddevicecertificatestate-update.md)|[managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md)|Update the properties of a [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object.|
|[Delete managedDeviceCertificateState](../api/intune-manageddevicecertificatestate-delete.md)|None|Deletes a [managedDeviceCertificateState](../resources/intune-manageddevicecertificatestate.md) object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|certificateEnhancedKeyUsage|String|**TODO: Add Description**|
|certificateErrorCode|Int32|**TODO: Add Description**|
|certificateExpirationDateTime|DateTimeOffset|**TODO: Add Description**|
|certificateIssuanceDateTime|DateTimeOffset|**TODO: Add Description**|
|certificateIssuanceState|certificateIssuanceStates|**TODO: Add Description**. Possible values are: `unknown`, `challengeIssued`, `challengeIssueFailed`, `requestCreationFailed`, `requestSubmitFailed`, `challengeValidationSucceeded`, `challengeValidationFailed`, `issueFailed`, `issuePending`, `issued`, `responseProcessingFailed`, `responsePending`, `enrollmentSucceeded`, `enrollmentNotNeeded`, `revoked`, `removedFromCollection`, `renewVerified`, `installFailed`, `installed`, `deleteFailed`, `deleted`, `renewalRequested`, `requested`.|
|certificateIssuer|String|**TODO: Add Description**|
|certificateKeyLength|Int32|**TODO: Add Description**|
|certificateKeyStorageProvider|keyStorageProviderOption|**TODO: Add Description**. Possible values are: `useTpmKspOtherwiseUseSoftwareKsp`, `useTpmKspOtherwiseFail`, `usePassportForWorkKspOtherwiseFail`, `useSoftwareKsp`.|
|certificateKeyUsage|keyUsages|**TODO: Add Description**. Possible values are: `keyEncipherment`, `digitalSignature`.|
|certificateLastIssuanceStateChangedDateTime|DateTimeOffset|**TODO: Add Description**|
|certificateProfileDisplayName|String|**TODO: Add Description**|
|certificateRevokeStatus|certificateRevocationStatus|**TODO: Add Description**. Possible values are: `none`, `pending`, `issued`, `failed`, `revoked`.|
|certificateSerialNumber|String|**TODO: Add Description**|
|certificateSubjectAlternativeNameFormat|subjectAlternativeNameType|**TODO: Add Description**. Possible values are: `none`, `emailAddress`, `userPrincipalName`, `customAzureADAttribute`, `domainNameService`, `universalResourceIdentifier`.|
|certificateSubjectAlternativeNameFormatString|String|**TODO: Add Description**|
|certificateSubjectNameFormat|subjectNameFormat|**TODO: Add Description**. Possible values are: `commonName`, `commonNameIncludingEmail`, `commonNameAsEmail`, `custom`, `commonNameAsIMEI`, `commonNameAsSerialNumber`, `commonNameAsAadDeviceId`, `commonNameAsIntuneDeviceId`, `commonNameAsDurableDeviceId`.|
|certificateSubjectNameFormatString|String|**TODO: Add Description**|
|certificateThumbprint|String|**TODO: Add Description**|
|certificateValidityPeriod|Int32|**TODO: Add Description**|
|certificateValidityPeriodUnits|certificateValidityPeriodScale|**TODO: Add Description**. Possible values are: `days`, `months`, `years`.|
|deviceDisplayName|String|**TODO: Add Description**|
|devicePlatform|devicePlatformType|**TODO: Add Description**. Possible values are: `android`, `androidForWork`, `iOS`, `macOS`, `windowsPhone81`, `windows81AndLater`, `windows10AndLater`, `androidWorkProfile`, `unknown`.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastCertificateStateChangeDateTime|DateTimeOffset|**TODO: Add Description**|
|userDisplayName|String|**TODO: Add Description**|

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

