import type { PermissionState } from '@capacitor/core';

export interface PermissionStatus {
  postNotifications: PermissionState;
}

export type AndroidNotificationPermissionType = 'postNotifications';
export interface AndroidNotificationPermissionPluginPermissions {
  permissions: AndroidNotificationPermissionType[];
}

export interface AndroidPostNotificationsPermissionPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
  checkPermissions(): Promise<PermissionStatus>;
  requestPermissions(
    permissions?: AndroidNotificationPermissionPluginPermissions,
  ): Promise<PermissionStatus>;
}
