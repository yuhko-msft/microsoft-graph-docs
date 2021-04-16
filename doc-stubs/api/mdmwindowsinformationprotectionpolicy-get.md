---
title: "Get mdmWindowsInformationProtectionPolicy"
description: "Read the properties and relationships of a mdmWindowsInformationProtectionPolicy object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Get mdmWindowsInformationProtectionPolicy
Namespace: microsoft.graph



Read the properties and relationships of a [mdmWindowsInformationProtectionPolicy](../resources/mdmwindowsinformationprotectionpolicy.md) object.

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
GET /deviceAppManagement/mdmWindowsInformationProtectionPolicies/{mdmWindowsInformationProtectionPolicyId}
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

If successful, this method returns a `200 OK` response code and a [mdmWindowsInformationProtectionPolicy](../resources/mdmwindowsinformationprotectionpolicy.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "get_mdmwindowsinformationprotectionpolicy"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceAppManagement/mdmWindowsInformationProtectionPolicies/{mdmWindowsInformationProtectionPolicyId}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.mdmWindowsInformationProtectionPolicy"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": {
    "@odata.type": "#microsoft.graph.mdmWindowsInformationProtectionPolicy",
    "id": "f06e18ea-18ea-f06e-ea18-6ef0ea186ef0",
    "createdDateTime": "String (timestamp)",
    "description": "String",
    "displayName": "String",
    "lastModifiedDateTime": "String (timestamp)",
    "roleScopeTagIds": [
      "String"
    ],
    "version": "String",
    "azureRightsManagementServicesAllowed": "Boolean",
    "dataRecoveryCertificate": {
      "@odata.type": "microsoft.graph.windowsInformationProtectionDataRecoveryCertificate"
    },
    "enforcementLevel": "String",
    "enterpriseDomain": "String",
    "enterpriseInternalProxyServers": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
      }
    ],
    "enterpriseIPRanges": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionIPRangeCollection"
      }
    ],
    "enterpriseIPRangesAreAuthoritative": "Boolean",
    "enterpriseNetworkDomainNames": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
      }
    ],
    "enterpriseProtectedDomainNames": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
      }
    ],
    "enterpriseProxiedDomains": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionProxiedDomainCollection"
      }
    ],
    "enterpriseProxyServers": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
      }
    ],
    "enterpriseProxyServersAreAuthoritative": "Boolean",
    "exemptApps": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionDesktopApp"
      }
    ],
    "iconsVisible": "Boolean",
    "indexingEncryptedStoresOrItemsBlocked": "Boolean",
    "isAssigned": "Boolean",
    "neutralDomainResources": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
      }
    ],
    "protectedApps": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionDesktopApp"
      }
    ],
    "protectionUnderLockConfigRequired": "Boolean",
    "revokeOnUnenrollDisabled": "Boolean",
    "rightsManagementServicesTemplateId": "Guid",
    "smbAutoEncryptedFileExtensions": [
      {
        "@odata.type": "microsoft.graph.windowsInformationProtectionResourceCollection"
      }
    ]
  }
}
```

