---
title: "Get macOSEndpointProtectionConfiguration"
description: "Read the properties and relationships of a macOSEndpointProtectionConfiguration object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get macOSEndpointProtectionConfiguration
Namespace: microsoft.graph



Read the properties and relationships of a [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object.

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
GET ** Entity URI for microsoft.graph.macOSEndpointProtectionConfiguration not found
```

## Optional query parameters
This method supports some of the OData query parameters to help customize the response. For general information, see [OData query parameters](/graph/query-parameters).

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|

## Request body
Do not supply a request body for this method.

## Response

If successful, this method returns a `200 OK` response code and a [macOSEndpointProtectionConfiguration](../resources/macosendpointprotectionconfiguration.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_macosendpointprotectionconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Entity URI for microsoft.graph.macOSEndpointProtectionConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.macOSEndpointProtectionConfiguration"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.macOSEndpointProtectionConfiguration",
    "id": "92a18367-8367-92a1-6783-a1926783a192",
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
    "advancedThreatProtectionAutomaticSampleSubmission": "String",
    "advancedThreatProtectionCloudDelivered": "String",
    "advancedThreatProtectionDiagnosticDataCollection": "String",
    "advancedThreatProtectionExcludedExtensions": [
      "String"
    ],
    "advancedThreatProtectionExcludedFiles": [
      "String"
    ],
    "advancedThreatProtectionExcludedFolders": [
      "String"
    ],
    "advancedThreatProtectionExcludedProcesses": [
      "String"
    ],
    "advancedThreatProtectionRealTime": "String",
    "fileVaultAllowDeferralUntilSignOut": "Boolean",
    "fileVaultDisablePromptAtSignOut": "Boolean",
    "fileVaultEnabled": "Boolean",
    "fileVaultHidePersonalRecoveryKey": "Boolean",
    "fileVaultInstitutionalRecoveryKeyCertificate": "Binary",
    "fileVaultInstitutionalRecoveryKeyCertificateFileName": "String",
    "fileVaultNumberOfTimesUserCanIgnore": "Integer",
    "fileVaultPersonalRecoveryKeyHelpMessage": "String",
    "fileVaultPersonalRecoveryKeyRotationInMonths": "Integer",
    "fileVaultSelectedRecoveryKeyTypes": "String",
    "firewallApplications": [
      {
        "@odata.type": "microsoft.graph.macOSFirewallApplication"
      }
    ],
    "firewallBlockAllIncoming": "Boolean",
    "firewallEnabled": "Boolean",
    "firewallEnableStealthMode": "Boolean",
    "gatekeeperAllowedAppSource": "String",
    "gatekeeperBlockOverride": "Boolean"
  }
}
```

