---
title: "Create officeSuiteApp"
description: "Create a new officeSuiteApp object."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: apiPageType
---

# Create officeSuiteApp
Namespace: microsoft.graph



Create a new [officeSuiteApp](../resources/officesuiteapp.md) object.

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
POST ** Collection URI for microsoft.graph.officeSuiteApp not found
```

## Request headers
|Name|Description|
|:---|:---|
|Authorization|Bearer {token}. Required.|
|Content-Type|application/json. Required.|

## Request body
In the request body, supply a JSON representation of the [officeSuiteApp](../resources/officesuiteapp.md) object.

The following table shows the properties that are required when you create the [officeSuiteApp](../resources/officesuiteapp.md).

|Property|Type|Description|
|:---|:---|:---|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|createdDateTime|DateTimeOffset|The date and time the app was created. Inherited from [mobileApp](../resources/mobileapp.md)|
|dependentAppCount|Int32|The total number of dependencies the child app has. Inherited from [mobileApp](../resources/mobileapp.md)|
|description|String|The description of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|developer|String|The developer of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|displayName|String|The admin provided or imported title of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|informationUrl|String|The more information Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|isAssigned|Boolean|The value indicating whether the app is assigned to at least one group. Inherited from [mobileApp](../resources/mobileapp.md)|
|isFeatured|Boolean|The value indicating whether the app is marked as featured by the admin. Inherited from [mobileApp](../resources/mobileapp.md)|
|largeIcon|[mimeContent](../resources/mimecontent.md)|The large icon, to be displayed in the app details and used for upload of the icon. Inherited from [mobileApp](../resources/mobileapp.md)|
|lastModifiedDateTime|DateTimeOffset|The date and time the app was last modified. Inherited from [mobileApp](../resources/mobileapp.md)|
|notes|String|Notes for the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|owner|String|The owner of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|privacyInformationUrl|String|The privacy statement Url. Inherited from [mobileApp](../resources/mobileapp.md)|
|publisher|String|The publisher of the app. Inherited from [mobileApp](../resources/mobileapp.md)|
|publishingState|mobileAppPublishingState|The publishing state for the app. The app cannot be assigned unless the app is published. Inherited from [mobileApp](../resources/mobileapp.md). Possible values are: `notPublished`, `processing`, `published`.|
|roleScopeTagIds|String collection|List of scope tag ids for this mobile app. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersededAppCount|Int32|The total number of apps this app is directly or indirectly superseded by. Inherited from [mobileApp](../resources/mobileapp.md)|
|supersedingAppCount|Int32|The total number of apps this app directly or indirectly supersedes. Inherited from [mobileApp](../resources/mobileapp.md)|
|uploadState|Int32|The upload state. Possible values are: 0 - `Not Ready`, 1 - `Ready`, 2 - `Processing`. Inherited from [mobileApp](../resources/mobileapp.md)|
|autoAcceptEula|Boolean|The value to accept the EULA automatically on the enduser's device.|
|excludedApps|[excludedApps](../resources/excludedapps.md)|The property to represent the apps which are excluded from the selected Office365 Product Id.|
|installProgressDisplayLevel|officeSuiteInstallProgressDisplayLevel|To specify the level of display for the Installation Progress Setup UI on the Device. Possible values are: `none`, `full`.|
|localesToInstall|String collection|The property to represent the locales which are installed when the apps from Office365 is installed. It uses standard RFC 6033. Ref: https://technet.microsoft.com/en-us/library/cc179219(v=office.16).aspx|
|officeConfigurationXml|Binary|The property to represent the XML configuration file that can be specified for Office ProPlus Apps. Takes precedence over all other properties. When present, the XML configuration file will be used to create the app.|
|officePlatformArchitecture|windowsArchitecture|The property to represent the Office365 app suite version. Possible values are: `none`, `x86`, `x64`, `arm`, `neutral`, `arm64`.|
|productIds|officeProductId collection|The Product Ids that represent the Office365 Suite SKU. Possible values are: `o365ProPlusRetail`, `o365BusinessRetail`, `visioProRetail`, `projectProRetail`.|
|shouldUninstallOlderVersionsOfOffice|Boolean|The property to determine whether to uninstall existing Office MSI if an Office365 app suite is deployed to the device or not.|
|targetVersion|String|The property to represent the specific target version for the Office365 app suite that should be remained deployed on the devices.|
|updateChannel|officeUpdateChannel|The property to represent the Office365 Update Channel. Possible values are: `none`, `current`, `deferred`, `firstReleaseCurrent`, `firstReleaseDeferred`, `monthlyEnterprise`.|
|updateVersion|String|The property to represent the update version in which the specific target version is available for the Office365 app suite.|
|useSharedComputerActivation|Boolean|The property to represent that whether the shared computer activation is used not for Office365 app suite.|



## Response

If successful, this method returns a `201 Created` response code and an [officeSuiteApp](../resources/officesuiteapp.md) object in the response body.

## Examples

### Request
<!-- {
  "blockType": "request",
  "name": "create_officesuiteapp_from_"
}
-->
``` http
POST https://graph.microsoft.com/v1.0** Collection URI for microsoft.graph.officeSuiteApp not found
Content-Type: application/json
Content-length: 1129

{
  "@odata.type": "#microsoft.graph.officeSuiteApp",
  "dependentAppCount": "Integer",
  "description": "String",
  "developer": "String",
  "displayName": "String",
  "informationUrl": "String",
  "isAssigned": "Boolean",
  "isFeatured": "Boolean",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "notes": "String",
  "owner": "String",
  "privacyInformationUrl": "String",
  "publisher": "String",
  "publishingState": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "supersededAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "uploadState": "Integer",
  "autoAcceptEula": "Boolean",
  "excludedApps": {
    "@odata.type": "microsoft.graph.excludedApps"
  },
  "installProgressDisplayLevel": "String",
  "localesToInstall": [
    "String"
  ],
  "officeConfigurationXml": "Binary",
  "officePlatformArchitecture": "String",
  "productIds": [
    "String"
  ],
  "shouldUninstallOlderVersionsOfOffice": "Boolean",
  "targetVersion": "String",
  "updateChannel": "String",
  "updateVersion": "String",
  "useSharedComputerActivation": "Boolean"
}
```


### Response
**Note:** The response object shown here might be shortened for readability.
<!-- {
  "blockType": "response",
  "truncated": true,
  "@odata.type": "microsoft.graph.officeSuiteApp"
}
-->
``` http
HTTP/1.1 201 Created
Content-Type: application/json

{
  "@odata.type": "#microsoft.graph.officeSuiteApp",
  "id": "06830be5-0be5-0683-e50b-8306e50b8306",
  "createdDateTime": "String (timestamp)",
  "dependentAppCount": "Integer",
  "description": "String",
  "developer": "String",
  "displayName": "String",
  "informationUrl": "String",
  "isAssigned": "Boolean",
  "isFeatured": "Boolean",
  "largeIcon": {
    "@odata.type": "microsoft.graph.mimeContent"
  },
  "lastModifiedDateTime": "String (timestamp)",
  "notes": "String",
  "owner": "String",
  "privacyInformationUrl": "String",
  "publisher": "String",
  "publishingState": "String",
  "roleScopeTagIds": [
    "String"
  ],
  "supersededAppCount": "Integer",
  "supersedingAppCount": "Integer",
  "uploadState": "Integer",
  "autoAcceptEula": "Boolean",
  "excludedApps": {
    "@odata.type": "microsoft.graph.excludedApps"
  },
  "installProgressDisplayLevel": "String",
  "localesToInstall": [
    "String"
  ],
  "officeConfigurationXml": "Binary",
  "officePlatformArchitecture": "String",
  "productIds": [
    "String"
  ],
  "shouldUninstallOlderVersionsOfOffice": "Boolean",
  "targetVersion": "String",
  "updateChannel": "String",
  "updateVersion": "String",
  "useSharedComputerActivation": "Boolean"
}
```

