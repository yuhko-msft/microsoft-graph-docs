---
title: "macOSWiredNetworkConfiguration resource type"
description: "MacOS wired network configuration profile."
author: "**TODO: Provide Github Name. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
localization_priority: Normal
ms.prod: "**TODO: Add MS prod. See [topic-level metadata reference](https://msgo.azurewebsites.net/add/document/guidelines/metadata.html#topic-level-metadata)**"
doc_type: resourcePageType
---

# macOSWiredNetworkConfiguration resource type

Namespace: microsoft.graph



MacOS wired network configuration profile.


Inherits from [deviceConfiguration](../resources/deviceconfiguration.md).

## Methods
|Method|Return type|Description|
|:---|:---|:---|
|[List macOSWiredNetworkConfigurations](../api/macoswirednetworkconfiguration-list.md)|[macOSWiredNetworkConfiguration](../resources/macoswirednetworkconfiguration.md) collection|Get a list of the [macOSWiredNetworkConfiguration](../resources/macoswirednetworkconfiguration.md) objects and their properties.|
|[Create macOSWiredNetworkConfiguration](../api/macoswirednetworkconfiguration-create.md)|[macOSWiredNetworkConfiguration](../resources/macoswirednetworkconfiguration.md)|Create a new [macOSWiredNetworkConfiguration](../resources/macoswirednetworkconfiguration.md) object.|
|[Get macOSWiredNetworkConfiguration](../api/macoswirednetworkconfiguration-get.md)|[macOSWiredNetworkConfiguration](../resources/macoswirednetworkconfiguration.md)|Read the properties and relationships of a [macOSWiredNetworkConfiguration](../resources/macoswirednetworkconfiguration.md) object.|
|[Update macOSWiredNetworkConfiguration](../api/macoswirednetworkconfiguration-update.md)|[macOSWiredNetworkConfiguration](../resources/macoswirednetworkconfiguration.md)|Update the properties of a [macOSWiredNetworkConfiguration](../resources/macoswirednetworkconfiguration.md) object.|
|[Delete macOSWiredNetworkConfiguration](../api/macoswirednetworkconfiguration-delete.md)|None|Deletes a [macOSWiredNetworkConfiguration](../resources/macoswirednetworkconfiguration.md) object.|
|[assign](../api/macoswirednetworkconfiguration-assign.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|**TODO: Add Description**|
|[assignedAccessMultiModeProfiles](../api/macoswirednetworkconfiguration-assignedaccessmultimodeprofiles.md)|None|**TODO: Add Description**|
|[windowsPrivacyAccessControls](../api/macoswirednetworkconfiguration-windowsprivacyaccesscontrols.md)|None|**TODO: Add Description**|
|[List assignments](../api/macoswirednetworkconfiguration-list-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|Get the deviceConfigurationAssignment resources from the assignments navigation property.|
|[Create deviceConfigurationAssignment](../api/macoswirednetworkconfiguration-post-assignments.md)|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md)|Create a new deviceConfigurationAssignment object.|
|[List deviceSettingStateSummaries](../api/macoswirednetworkconfiguration-list-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Get the settingStateDeviceSummary resources from the deviceSettingStateSummaries navigation property.|
|[Create settingStateDeviceSummary](../api/macoswirednetworkconfiguration-post-devicesettingstatesummaries.md)|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md)|Create a new settingStateDeviceSummary object.|
|[List deviceStatuses](../api/macoswirednetworkconfiguration-list-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Get the deviceConfigurationDeviceStatus resources from the deviceStatuses navigation property.|
|[Create deviceConfigurationDeviceStatus](../api/macoswirednetworkconfiguration-post-devicestatuses.md)|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md)|Create a new deviceConfigurationDeviceStatus object.|
|[List deviceConfigurationDeviceOverview](../api/macoswirednetworkconfiguration-list-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md) collection|Get the deviceConfigurationDeviceOverview resources from the deviceStatusOverview navigation property.|
|[Create deviceConfigurationDeviceOverview](../api/macoswirednetworkconfiguration-post-devicestatusoverview.md)|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Create a new deviceConfigurationDeviceOverview object.|
|[List groupAssignments](../api/macoswirednetworkconfiguration-list-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|Get the deviceConfigurationGroupAssignment resources from the groupAssignments navigation property.|
|[Create deviceConfigurationGroupAssignment](../api/macoswirednetworkconfiguration-post-groupassignments.md)|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md)|Create a new deviceConfigurationGroupAssignment object.|
|[List macOSCertificateProfileBase](../api/macoswirednetworkconfiguration-list-identitycertificateforclientauthentication.md)|[macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md) collection|Get the macOSCertificateProfileBase resources from the identityCertificateForClientAuthentication navigation property.|
|[Add macOSCertificateProfileBase](../api/macoswirednetworkconfiguration-post-identitycertificateforclientauthentication.md)|[macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md)|Add identityCertificateForClientAuthentication by posting to the identityCertificateForClientAuthentication collection.|
|[List macOSTrustedRootCertificate](../api/macoswirednetworkconfiguration-list-rootcertificateforservervalidation.md)|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md) collection|Get the macOSTrustedRootCertificate resources from the rootCertificateForServerValidation navigation property.|
|[Add macOSTrustedRootCertificate](../api/macoswirednetworkconfiguration-post-rootcertificateforservervalidation.md)|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md)|Add rootCertificateForServerValidation by posting to the rootCertificateForServerValidation collection.|
|[List userStatuses](../api/macoswirednetworkconfiguration-list-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Get the deviceConfigurationUserStatus resources from the userStatuses navigation property.|
|[Create deviceConfigurationUserStatus](../api/macoswirednetworkconfiguration-post-userstatuses.md)|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md)|Create a new deviceConfigurationUserStatus object.|
|[List deviceConfigurationUserOverview](../api/macoswirednetworkconfiguration-list-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md) collection|Get the deviceConfigurationUserOverview resources from the userStatusOverview navigation property.|
|[Create deviceConfigurationUserOverview](../api/macoswirednetworkconfiguration-post-userstatusoverview.md)|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Create a new deviceConfigurationUserOverview object.|

## Properties
|Property|Type|Description|
|:---|:---|:---|
|authenticationMethod|wiFiAuthenticationMethod|Authentication Method when EAP Type is configured to PEAP or EAP-TTLS. Possible values are: `certificate`, `usernameAndPassword`, `derivedCredential`.|
|createdDateTime|DateTimeOffset|DateTime the object was created. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|description|String|Admin provided description of the Device Configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleDeviceMode|[deviceManagementApplicabilityRuleDeviceMode](../resources/devicemanagementapplicabilityruledevicemode.md)|The device mode applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsEdition|[deviceManagementApplicabilityRuleOsEdition](../resources/devicemanagementapplicabilityruleosedition.md)|The OS edition applicability for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceManagementApplicabilityRuleOsVersion|[deviceManagementApplicabilityRuleOsVersion](../resources/devicemanagementapplicabilityruleosversion.md)|The OS version applicability rule for this Policy. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|displayName|String|Admin provided name of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|eapFastConfiguration|eapFastConfiguration|EAP-FAST Configuration Option when EAP-FAST is the selected EAP Type. Possible values are: `noProtectedAccessCredential`, `useProtectedAccessCredential`, `useProtectedAccessCredentialAndProvision`, `useProtectedAccessCredentialAndProvisionAnonymously`.|
|eapType|eapType|Extensible Authentication Protocol (EAP). Indicates the type of EAP protocol set on the wired network. Possible values are: `eapTls`, `leap`, `eapSim`, `eapTtls`, `peap`, `eapFast`.|
|enableOuterIdentityPrivacy|String|Enable identity privacy (Outer Identity) when EAP Type is configured to EAP-TTLS, EAP-FAST or PEAP. This property masks usernames with the text you enter. For example, if you use 'anonymous', each user that authenticates with this wired network using their real username is displayed as 'anonymous'.|
|id|String|**TODO: Add Description** Inherited from [entity](../resources/entity.md)|
|lastModifiedDateTime|DateTimeOffset|DateTime the object was last modified. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|networkInterface|wiredNetworkInterface|Network interface. Possible values are: `anyEthernet`, `firstActiveEthernet`, `secondActiveEthernet`, `thirdActiveEthernet`, `firstEthernet`, `secondEthernet`, `thirdEthernet`.|
|networkName|String|Network Name|
|nonEapAuthenticationMethodForEapTtls|nonEapAuthenticationMethodForEapTtlsType|Non-EAP Method for Authentication (Inner Identity) when EAP Type is EAP-TTLS and Authenticationmethod is Username and Password. Possible values are: `unencryptedPassword`, `challengeHandshakeAuthenticationProtocol`, `microsoftChap`, `microsoftChapVersionTwo`.|
|roleScopeTagIds|String collection|List of Scope Tags for this Entity instance. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|supportsScopeTags|Boolean|Indicates whether or not the underlying Device Configuration supports the assignment of scope tags. Assigning to the ScopeTags property is not allowed when this value is false and entities will not be visible to scoped users. This occurs for Legacy policies created in Silverlight and can be resolved by deleting and recreating the policy in the Azure Portal. This property is read-only. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|trustedServerCertificateNames|String collection|Trusted server certificate names when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP. This is the common name used in the certificates issued by your trusted certificate authority (CA). If you provide this information, you can bypass the dynamic trust dialog that is displayed on end users devices when they connect to this wired network.|
|version|Int32|Version of the device configuration. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## Relationships
|Relationship|Type|Description|
|:---|:---|:---|
|assignments|[deviceConfigurationAssignment](../resources/deviceconfigurationassignment.md) collection|The list of assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceSettingStateSummaries|[settingStateDeviceSummary](../resources/settingstatedevicesummary.md) collection|Device Configuration Setting State Device Summary Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatuses|[deviceConfigurationDeviceStatus](../resources/deviceconfigurationdevicestatus.md) collection|Device configuration installation status by device. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|deviceStatusOverview|[deviceConfigurationDeviceOverview](../resources/deviceconfigurationdeviceoverview.md)|Device Configuration devices status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|groupAssignments|[deviceConfigurationGroupAssignment](../resources/deviceconfigurationgroupassignment.md) collection|The list of group assignments for the device configuration profile. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|identityCertificateForClientAuthentication|[macOSCertificateProfileBase](../resources/macoscertificateprofilebase.md)|Identity Certificate for client authentication when EAP Type is configured to EAP-TLS, EAP-TTLS (with Certificate Authentication), or PEAP (with Certificate Authentication).|
|rootCertificateForServerValidation|[macOSTrustedRootCertificate](../resources/macostrustedrootcertificate.md)|Trusted Root Certificate for Server Validation when EAP Type is configured to EAP-TLS/TTLS/FAST or PEAP.|
|userStatuses|[deviceConfigurationUserStatus](../resources/deviceconfigurationuserstatus.md) collection|Device configuration installation status by user. Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|
|userStatusOverview|[deviceConfigurationUserOverview](../resources/deviceconfigurationuseroverview.md)|Device Configuration users status overview Inherited from [deviceConfiguration](../resources/deviceconfiguration.md)|

## JSON representation
The following is a JSON representation of the resource.
<!-- {
  "blockType": "resource",
  "keyProperty": "id",
  "@odata.type": "microsoft.graph.macOSWiredNetworkConfiguration",
  "baseType": "microsoft.graph.deviceConfiguration",
  "openType": false
}
-->
``` json
{
  "@odata.type": "#microsoft.graph.macOSWiredNetworkConfiguration",
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
  "authenticationMethod": "String",
  "eapFastConfiguration": "String",
  "eapType": "String",
  "enableOuterIdentityPrivacy": "String",
  "networkInterface": "String",
  "networkName": "String",
  "nonEapAuthenticationMethodForEapTtls": "String",
  "trustedServerCertificateNames": [
    "String"
  ]
}
```

