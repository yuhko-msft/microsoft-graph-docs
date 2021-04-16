---
title: "List intuneBrandingProfiles"
description: "Get a list of the intuneBrandingProfile objects and their properties."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# List intuneBrandingProfiles
Namespace: microsoft.graph



Get a list of the [intuneBrandingProfile](../resources/intunebrandingprofile.md) objects and their properties.

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
GET /deviceManagement/intuneBrandingProfiles
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

If successful, this method returns a `200 OK` response code and a collection of [intuneBrandingProfile](../resources/intunebrandingprofile.md) objects in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "list_intunebrandingprofile"
}
-->
``` http
GET https://graph.microsoft.com/v1.0/deviceManagement/intuneBrandingProfiles
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "Collection(microsoft.graph.intuneBrandingProfile)"
}
-->
``` http
HTTP/1.1 200 OK
Content-Type: application/json

{
  "value": [
    {
      "@odata.type": "#microsoft.graph.intuneBrandingProfile",
      "id": "9e1e22b2-22b2-9e1e-b222-1e9eb2221e9e",
      "companyPortalBlockedActions": [
        {
          "@odata.type": "microsoft.graph.companyPortalBlockedAction"
        }
      ],
      "contactITEmailAddress": "String",
      "contactITName": "String",
      "contactITNotes": "String",
      "contactITPhoneNumber": "String",
      "createdDateTime": "String (timestamp)",
      "customCanSeePrivacyMessage": "String",
      "customCantSeePrivacyMessage": "String",
      "customPrivacyMessage": "String",
      "disableClientTelemetry": "Boolean",
      "displayName": "String",
      "enrollmentAvailability": "String",
      "isDefaultProfile": "Boolean",
      "isFactoryResetDisabled": "Boolean",
      "isRemoveDeviceDisabled": "Boolean",
      "landingPageCustomizedImage": {
        "@odata.type": "microsoft.graph.mimeContent"
      },
      "lastModifiedDateTime": "String (timestamp)",
      "lightBackgroundLogo": {
        "@odata.type": "microsoft.graph.mimeContent"
      },
      "onlineSupportSiteName": "String",
      "onlineSupportSiteUrl": "String",
      "privacyUrl": "String",
      "profileDescription": "String",
      "profileName": "String",
      "roleScopeTagIds": [
        "String"
      ],
      "sendDeviceOwnershipChangePushNotification": "Boolean",
      "showAzureADEnterpriseApps": "Boolean",
      "showDisplayNameNextToLogo": "Boolean",
      "showLogo": "Boolean",
      "showOfficeWebApps": "Boolean",
      "themeColor": {
        "@odata.type": "microsoft.graph.rgbColor"
      },
      "themeColorLogo": {
        "@odata.type": "microsoft.graph.mimeContent"
      }
    }
  ]
}
```

