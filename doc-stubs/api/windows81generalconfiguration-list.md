---
title: "List windows81GeneralConfiguration"
description: "Get a list of the windows81GeneralConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List windows81GeneralConfiguration
Namespace: microsoft.graph



Get a list of the [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.windows81GeneralConfiguration not found
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

If successful, this method returns a `200 OK` response code and a collection of [windows81GeneralConfiguration](../resources/windows81generalconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_windows81generalconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.windows81GeneralConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.windows81GeneralConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.windows81GeneralConfiguration",
      "id": "92d71a9f-1a9f-92d7-9f1a-d7929f1ad792",
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
      "accountsBlockAddingNonMicrosoftAccountEmail": "Boolean",
      "applyOnlyToWindows81": "Boolean",
      "browserBlockAutofill": "Boolean",
      "browserBlockAutomaticDetectionOfIntranetSites": "Boolean",
      "browserBlockEnterpriseModeAccess": "Boolean",
      "browserBlockJavaScript": "Boolean",
      "browserBlockPlugins": "Boolean",
      "browserBlockPopups": "Boolean",
      "browserBlockSendingDoNotTrackHeader": "Boolean",
      "browserBlockSingleWordEntryOnIntranetSites": "Boolean",
      "browserEnterpriseModeSiteListLocation": "String",
      "browserInternetSecurityLevel": "String",
      "browserIntranetSecurityLevel": "String",
      "browserLoggingReportLocation": "String",
      "browserRequireFirewall": "Boolean",
      "browserRequireFraudWarning": "Boolean",
      "browserRequireHighSecurityForRestrictedSites": "Boolean",
      "browserRequireSmartScreen": "Boolean",
      "browserTrustedSitesSecurityLevel": "String",
      "cellularBlockDataRoaming": "Boolean",
      "diagnosticsBlockDataSubmission": "Boolean",
      "minimumAutoInstallClassification": "String",
      "passwordBlockPicturePasswordAndPin": "Boolean",
      "passwordExpirationDays": "Integer",
      "passwordMinimumCharacterSetCount": "Integer",
      "passwordMinimumLength": "Integer",
      "passwordMinutesOfInactivityBeforeScreenTimeout": "Integer",
      "passwordPreviousPasswordBlockCount": "Integer",
      "passwordRequiredType": "String",
      "passwordSignInFailureCountBeforeFactoryReset": "Integer",
      "storageRequireDeviceEncryption": "Boolean",
      "updatesMinimumAutoInstallClassification": "String",
      "updatesRequireAutomaticUpdates": "Boolean",
      "userAccountControlSettings": "String",
      "workFoldersUrl": "String"
    }
  ]
}
```

