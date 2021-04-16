---
title: "macOSDeviceFeaturesConfiguration resource type"
description: "MacOS device features configuration profile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSDeviceFeaturesConfiguration resource type

Namespace: microsoft.graph



MacOS device features configuration profile.


Inherits from [appleDeviceFeaturesConfigurationBase](../resources/appledevicefeaturesconfigurationbase.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSDeviceFeaturesConfigurations](../api/macosdevicefeaturesconfiguration-list.md)|[macOSDeviceFeaturesConfiguration](../resources/macosdevicefeaturesconfiguration.md) collection|Get a list of the [macOSDeviceFeaturesConfiguration](../resources/macosdevicefeaturesconfiguration.md) objects and their properties.|
|[Create macOSDeviceFeaturesConfiguration](../api/macosdevicefeaturesconfiguration-create.md)|[macOSDeviceFeaturesConfiguration](../resources/macosdevicefeaturesconfiguration.md)|Create a new [macOSDeviceFeaturesConfiguration](../resources/macosdevicefeaturesconfiguration.md) object.|
|[Get macOSDeviceFeaturesConfiguration](../api/macosdevicefeaturesconfiguration-get.md)|[macOSDeviceFeaturesConfiguration](../resources/macosdevicefeaturesconfiguration.md)|Read the properties and relationships of a [macOSDeviceFeaturesConfiguration](../resources/macosdevicefeaturesconfiguration.md) object.|
|[Update macOSDeviceFeaturesConfiguration](../api/macosdevicefeaturesconfiguration-update.md)|[macOSDeviceFeaturesConfiguration](../resources/macosdevicefeaturesconfiguration.md)|Update the properties of a [macOSDeviceFeaturesConfiguration](../resources/macosdevicefeaturesconfiguration.md) object.|
|[Delete macOSDeviceFeaturesConfiguration](../api/macosdevicefeaturesconfiguration-delete.md)|None|Deletes a [macOSDeviceFeaturesConfiguration](../resources/macosdevicefeaturesconfiguration.md) object.|
|[List macOSCertificateProfileBase](../api/macosdevicefeaturesconfiguration-list-singlesignonextensionpkinitcertificate.md)|[macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md) collection|Get the macOSCertificateProfileBase resources from the singleSignOnExtensionPkinitCertificate navigation property.|
|[Add macOSCertificateProfileBase](../api/macosdevicefeaturesconfiguration-post-singlesignonextensionpkinitcertificate.md)|[macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md)|Add singleSignOnExtensionPkinitCertificate by posting to the singleSignOnExtensionPkinitCertificate collection.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|adminShowHostInfo|Boolean|Whether to show admin host information on the login window.|
|airPrintDestinations|[airPrintDestination](../resources/airprintdestination.md) collection|An array of AirPrint printers that should always be shown. This collection can contain a maximum of 500 elements. Inherited from [appleDeviceFeaturesConfigurationBase](../resources/appledevicefeaturesconfigurationbase.md)|
|appAssociatedDomains|[macOSAssociatedDomainsItem](../resources/macosassociateddomainsitem.md) collection|Gets or sets a list that maps apps to their associated domains. Application identifiers must be unique. This collection can contain a maximum of 500 elements.|
|associatedDomains|[keyValuePair](../resources/keyvaluepair.md) collection|DEPRECATED: use appAssociatedDomains instead. Gets or sets a list that maps apps to their associated domains. The key should match the app's ID, and the value should be a string in the form of "service:domain" where domain is a fully qualified hostname (e.g. webcredentials:example.com). This collection can contain a maximum of 500 elements.|
|authorizedUsersListHidden|Boolean|Whether to show the name and password dialog or a list of users on the login window.|
|authorizedUsersListHideAdminUsers|Boolean|Whether to hide admin users in the authorized users list on the login window.|
|authorizedUsersListHideLocalUsers|Boolean|Whether to show only network and system users in the authorized users list on the login window.|
|authorizedUsersListHideMobileAccounts|Boolean|Whether to hide mobile users in the authorized users list on the login window.|
|authorizedUsersListIncludeNetworkUsers|Boolean|Whether to show network users in the authorized users list on the login window.|
|authorizedUsersListShowOtherManagedUsers|Boolean|Whether to show other users in the authorized users list on the login window.|
|autoLaunchItems|[macOSLaunchItem](../resources/macoslaunchitem.md) collection|List of applications, files, folders, and other items to launch when the user logs in. This collection can contain a maximum of 500 elements.|
|consoleAccessDisabled|Boolean|Whether the Other user will disregard use of the `>console> special user name.|
|contentCachingBlockDeletion|Boolean|Prevents content caches from purging content to free up disk space for other apps.|
|contentCachingClientListenRanges|[ipRange](../resources/iprange.md) collection|A list of custom IP ranges content caches will use to listen for clients. This collection can contain a maximum of 500 elements.|
|contentCachingClientPolicy|macOSContentCachingClientPolicy|Determines the method in which content caching servers will listen for clients. Possible values are: `notConfigured`, `clientsInLocalNetwork`, `clientsWithSamePublicIpAddress`, `clientsInCustomLocalNetworks`, `clientsInCustomLocalNetworksWithFallback`.|
|contentCachingDataPath|String|The path to the directory used to store cached content. The value must be (or end with) /Library/Application Support/Apple/AssetCache/Data|
|contentCachingDisableConnectionSharing|Boolean|Disables internet connection sharing.|
|contentCachingEnabled|Boolean|Enables content caching and prevents it from being disabled by the user.|
|contentCachingForceConnectionSharing|Boolean|Forces internet connection sharing. contentCachingDisableConnectionSharing overrides this setting.|
|contentCachingKeepAwake|Boolean|Prevent the device from sleeping if content caching is enabled.|
|contentCachingLogClientIdentities|Boolean|Enables logging of IP addresses and ports of clients that request cached content.|
|contentCachingMaxSizeBytes|Int32|The maximum number of bytes of disk space that will be used for the content cache. A value of 0 (default) indicates unlimited disk space. |
|contentCachingParents|String collection|A list of IP addresses representing parent content caches.|
|contentCachingParentSelectionPolicy|macOSContentCachingParentSelectionPolicy|Determines the method in which content caching servers will select parents if multiple are present. Possible values are: `notConfigured`, `roundRobin`, `firstAvailable`, `urlPathHash`, `random`, `stickyAvailable`.|
|contentCachingPeerFilterRanges|[ipRange](../resources/iprange.md) collection|A list of custom IP ranges content caches will use to query for content from peers caches. This collection can contain a maximum of 500 elements.|
|contentCachingPeerListenRanges|[ipRange](../resources/iprange.md) collection|A list of custom IP ranges content caches will use to listen for peer caches. This collection can contain a maximum of 500 elements.|
|contentCachingPeerPolicy|macOSContentCachingPeerPolicy|Determines the method in which content caches peer with other caches. Possible values are: `notConfigured`, `peersInLocalNetwork`, `peersWithSamePublicIpAddress`, `peersInCustomLocalNetworks`.|
|contentCachingPort|Int32|Sets the port used for content caching. If the value is 0, a random available port will be selected. Valid values 0 to 65535|
|contentCachingPublicRanges|[ipRange](../resources/iprange.md) collection|A list of custom IP ranges that Apple's content caching service should use to match clients to content caches. This collection can contain a maximum of 500 elements.|
|contentCachingShowAlerts|Boolean|Display content caching alerts as system notifications.|
|contentCachingType|macOSContentCachingType|Determines what type of content is allowed to be cached by Apple's content caching service. Possible values are: `notConfigured`, `userContentOnly`, `sharedContentOnly`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|loginWindowText|String|Custom text to be displayed on the login window.|
|logOutDisabledWhileLoggedIn|Boolean|Whether the Log Out menu item on the login window will be disabled while the user is logged in.|
|macOSSingleSignOnExtension|[macOSSingleSignOnExtension](../resources/macossinglesignonextension.md)|Gets or sets a single sign-on extension profile.|
|powerOffDisabledWhileLoggedIn|Boolean|Whether the Power Off menu item on the login window will be disabled while the user is logged in.|
|restartDisabled|Boolean|Whether to hide the Restart button item on the login window.|
|restartDisabledWhileLoggedIn|Boolean|Whether the Restart menu item on the login window will be disabled while the user is logged in.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|screenLockDisableImmediate|Boolean|Whether to disable the immediate screen lock functions.|
|shutDownDisabled|Boolean|Whether to hide the Shut Down button item on the login window.|
|shutDownDisabledWhileLoggedIn|Boolean|Whether the Shut Down menu item on the login window will be disabled while the user is logged in.|
|singleSignOnExtension|[singleSignOnExtension](../resources/singlesignonextension.md)|Gets or sets a single sign-on extension profile. Deprecated: use MacOSSingleSignOnExtension instead.|
|sleepDisabled|Boolean|Whether to hide the Sleep menu item on the login window.|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|singleSignOnExtensionPkinitCertificate|[macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md)|PKINIT Certificate for the authentication with single sign-on extensions.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOSDeviceFeaturesConfiguration",
  "baseType": "microsoft.graph.appleDeviceFeaturesConfigurationBase",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSDeviceFeaturesConfiguration",
  "id": "String (identifier)",
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
  "airPrintDestinations": [
    {
      "@odata.type": "microsoft.graph.airPrintDestination"
    }
  ],
  "adminShowHostInfo": "Boolean",
  "appAssociatedDomains": [
    {
      "@odata.type": "microsoft.graph.macOSAssociatedDomainsItem"
    }
  ],
  "associatedDomains": [
    {
      "@odata.type": "microsoft.graph.keyValuePair"
    }
  ],
  "authorizedUsersListHidden": "Boolean",
  "authorizedUsersListHideAdminUsers": "Boolean",
  "authorizedUsersListHideLocalUsers": "Boolean",
  "authorizedUsersListHideMobileAccounts": "Boolean",
  "authorizedUsersListIncludeNetworkUsers": "Boolean",
  "authorizedUsersListShowOtherManagedUsers": "Boolean",
  "autoLaunchItems": [
    {
      "@odata.type": "microsoft.graph.macOSLaunchItem"
    }
  ],
  "consoleAccessDisabled": "Boolean",
  "contentCachingBlockDeletion": "Boolean",
  "contentCachingClientListenRanges": [
    {
      "@odata.type": "microsoft.graph.iPv4CidrRange"
    }
  ],
  "contentCachingClientPolicy": "String",
  "contentCachingDataPath": "String",
  "contentCachingDisableConnectionSharing": "Boolean",
  "contentCachingEnabled": "Boolean",
  "contentCachingForceConnectionSharing": "Boolean",
  "contentCachingKeepAwake": "Boolean",
  "contentCachingLogClientIdentities": "Boolean",
  "contentCachingMaxSizeBytes": "Integer",
  "contentCachingParents": [
    "String"
  ],
  "contentCachingParentSelectionPolicy": "String",
  "contentCachingPeerFilterRanges": [
    {
      "@odata.type": "microsoft.graph.iPv4CidrRange"
    }
  ],
  "contentCachingPeerListenRanges": [
    {
      "@odata.type": "microsoft.graph.iPv4CidrRange"
    }
  ],
  "contentCachingPeerPolicy": "String",
  "contentCachingPort": "Integer",
  "contentCachingPublicRanges": [
    {
      "@odata.type": "microsoft.graph.iPv4CidrRange"
    }
  ],
  "contentCachingShowAlerts": "Boolean",
  "contentCachingType": "String",
  "loginWindowText": "String",
  "logOutDisabledWhileLoggedIn": "Boolean",
  "macOSSingleSignOnExtension": {
    "@odata.type": "microsoft.graph.macOSSingleSignOnExtension"
  },
  "powerOffDisabledWhileLoggedIn": "Boolean",
  "restartDisabled": "Boolean",
  "restartDisabledWhileLoggedIn": "Boolean",
  "screenLockDisableImmediate": "Boolean",
  "shutDownDisabled": "Boolean",
  "shutDownDisabledWhileLoggedIn": "Boolean",
  "singleSignOnExtension": {
    "@odata.type": "microsoft.graph.singleSignOnExtension"
  },
  "sleepDisabled": "Boolean"
}
```

