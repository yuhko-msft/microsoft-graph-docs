---
title: "List sharedPCConfigurations"
description: "Get a list of the sharedPCConfiguration objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List sharedPCConfigurations
Namespace: microsoft.graph



Get a list of the [sharedPCConfiguration](../resources/sharedpcconfiguration.md) objects and their properties.

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
GET ** Collection URI for microsoft.graph.sharedPCConfiguration not found
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

If successful, this method returns a `200 OK` response code and a collection of [sharedPCConfiguration](../resources/sharedpcconfiguration.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_sharedpcconfiguration"
}
-->
``` http
GET https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.sharedPCConfiguration not found
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.sharedPCConfiguration)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.sharedPCConfiguration",
      "id": "a02480aa-80aa-a024-aa80-24a0aa8024a0",
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
      "accountManagerPolicy": {
        "@odata.type": "microsoft.graph.sharedPCAccountManagerPolicy"
      },
      "allowedAccounts": "String",
      "allowLocalStorage": "Boolean",
      "disableAccountManager": "Boolean",
      "disableEduPolicies": "Boolean",
      "disablePowerPolicies": "Boolean",
      "disableSignInOnResume": "Boolean",
      "enabled": "Boolean",
      "fastFirstSignIn": "String",
      "idleTimeBeforeSleepInSeconds": "Integer",
      "kioskAppDisplayName": "String",
      "kioskAppUserModelId": "String",
      "localStorage": "String",
      "maintenanceStartTime": "String (time of day)",
      "setAccountManager": "String",
      "setEduPolicies": "String",
      "setPowerPolicies": "String",
      "signInOnResume": "String"
    }
  ]
}
```

